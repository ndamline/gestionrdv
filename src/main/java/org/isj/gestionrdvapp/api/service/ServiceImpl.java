package org.isj.gestionrdvapp.api.service;



import org.isj.gestionrdvapp.api.domaine.entities.EmploiDeTemps;
import org.isj.gestionrdvapp.api.domaine.entities.Medecin;
import org.isj.gestionrdvapp.api.domaine.entities.Patient;
import org.isj.gestionrdvapp.api.repository.EmploiDeTempsRepository;
import org.isj.gestionrdvapp.api.repository.MedecinRepository;
import org.isj.gestionrdvapp.api.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements IService {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    MedecinRepository medecinRepository;
    @Autowired
    EmploiDeTempsRepository emploiDeTempsRepository;

    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient recherchePatient(String telephone) {
        return patientRepository.findByTelephone(telephone);
    }

    @Override
    public List<Medecin> getAllMedecin() { return medecinRepository.findAll(); }

    @Override
    public Medecin saveMedecin(Medecin medecin){ return medecinRepository.save(medecin);}

    @Override
    public EmploiDeTemps creerEmploiDeTemps(EmploiDeTemps emploiDeTemps){
        return emploiDeTempsRepository.save(emploiDeTemps);



    }
}
