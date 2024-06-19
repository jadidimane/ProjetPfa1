package ma.xproce.pfaecom.service;

import ma.xproce.pfaecom.dao.entities.Visiteur;

import java.util.List;

public interface VisiteurManager {
    public Boolean deleteVisiteur(Visiteur visiteur);
    public List<Visiteur> getAllVisiteurs();

}
