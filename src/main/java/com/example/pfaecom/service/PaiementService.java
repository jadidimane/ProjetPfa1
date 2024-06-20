package ma.xproce.pfaecom.service;

import ma.xproce.pfaecom.dao.entities.Client;
import ma.xproce.pfaecom.dao.entities.Paiement;
import ma.xproce.pfaecom.dao.repositories.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PaiementService implements PaiementManager{
    @Autowired
    PaiementRepository paiementRepository;
    @Override
    public Paiement addPaiement(Paiement paiement) {
        if(paiement.getMontant()>0){
            paiement.setDatePaiement(LocalDate.now());
            return paiementRepository.save(paiement);
        }
        return null;
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        Paiement paiement1=paiementRepository.findById(paiement.getId()).orElse(null);
        if(paiement1!=null){
        if(paiement.getMontant()>0){
            paiement1.setMontant(paiement.getMontant());
            paiement1.setNumeroCompte(paiement.getNumeroCompte());
            paiement1.setMethode(paiement.getMethode());
            paiement1.setDatePaiement(LocalDate.now());
            //            paiement1.setPanier(paiement.getPanier());
            //            paiement.getPanier.setPaiement(paiement1);
            return paiementRepository.save(paiement1);
        }}
        return null;
    }

    @Override
    public Boolean deletePaiement(Paiement paiement) {
        if (paiementRepository.existsById(paiement.getId())) {
            Paiement p = paiementRepository.findById(paiement.getId()).orElse(null);
            if (p != null) {
                paiementRepository.delete(paiement);
                return true;
            }

        }
        return false;    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement getPaiementById(Integer id) {
        return paiementRepository.findById(id).orElse(null);
    }
}
