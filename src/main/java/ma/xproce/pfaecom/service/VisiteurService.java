package ma.xproce.pfaecom.service;

import ma.xproce.pfaecom.dao.entities.Visiteur;
import ma.xproce.pfaecom.dao.repositories.VisiteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VisiteurService implements VisiteurManager{
    @Autowired
    VisiteurRepository visiteurRepository;
    @Override
    public Boolean deleteVisiteur(Visiteur visiteur) {
        Visiteur visiteur1=visiteurRepository.findById(visiteur.getId()).orElse(null);
        if(visiteur1!=null){
             visiteurRepository.delete(visiteur);
             return true;
        }
        return false;
    }

    @Override
    public List<Visiteur> getAllVisiteurs() {
        return visiteurRepository.findAll();
    }
}
