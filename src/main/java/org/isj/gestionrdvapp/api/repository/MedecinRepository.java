package org.isj.gestionrdvapp.api.repository;

import org.isj.gestionrdvapp.api.domaine.entities.Medecin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {

    Medecin findByNumOrdre(Long numordre);

    List<Medecin> findByNom(String nom);

    List<Medecin> findByPrenom(String prenom);
    Medecin findByEmail(String email);

    Medecin findByTelephone(int telephone);
    List<Medecin> findBySpecialite(String specialite);

    @Query("SELECT m FROM Medecin m WHERE m.specialite=:specialite")
    List<Medecin> findMedecinBySpecialite(@Param("specialite") String specialite);

}
