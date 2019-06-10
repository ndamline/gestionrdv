package org.isj.gestionrdvapp.api.repository;

import org.isj.gestionrdvapp.api.domaine.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {


    Patient findByIdPatient(Long idPatient);

    List<Patient> findByNom(String nom);

    List<Patient> findByPrenom(String prenom);
    Patient findByEmail(String email);
    List<Patient> findBySexe(String sexe);
    Patient findByTelephone(String telephone);
    List<Patient> findByDateNaissance(String dateNaissance);

    @Query("SELECT p  FROM Patient p WHERE p.sexe=:sexe")
    List<Patient> findPatientBySexe(@Param("sexe") String sexe);


}
