package org.isj.gestionrdvapp.api.service;

import org.isj.gestionrdvapp.api.domaine.entities.EmploiDeTemps;
import org.isj.gestionrdvapp.api.domaine.entities.Medecin;
import org.isj.gestionrdvapp.api.domaine.entities.Patient;

import java.util.List;

public interface IService {
    //liste des patients
    List<Patient> getAllPatient();

    //liste des medecins
    List<Medecin> getAllMedecin();

    //liste des emplois de temps des differents medecins
     //List<EmploiDeTemps> getAllEmploiTemps(Medecin medecin);

    //liste des rdv d'un medecin un jour donné
     //List<Rdv> getAllRdvMedecinJour(Medecin medecin, Date jourRdv);

    //ajouter un emploi de temps

    public EmploiDeTemps creerEmploiDeTemps(EmploiDeTemps emploiDeTemps);

    //supprimer un rdv
    //public void supprimerRdv(Rdv rdv);

    //trouver un medecin identifié par sa specialite
    //Medecin getMedecinBySpecialite(String specialite);

    //enregistrer un patient
    public Patient savePatient(Patient patient);

    public Patient recherchePatient(String telephone);

    //enregistrer un medecin

    public Medecin saveMedecin(Medecin medecin);
}
