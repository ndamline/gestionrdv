package org.isj.gestionrdvapp.api.repository;


import org.isj.gestionrdvapp.api.domaine.entities.EmploiDeTemps;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface EmploiDeTempsRepository extends JpaRepository<EmploiDeTemps,Long> {

    EmploiDeTemps findByIdEmploi(Long idEmploi);

    List<EmploiDeTemps> findByHdebut(String hdebut);

    List<EmploiDeTemps> findByHfin(String hfin);


    List<EmploiDeTemps> findByJourRdv(String jourRdv);
}
