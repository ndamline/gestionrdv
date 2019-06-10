package org.isj.gestionrdvapp.api.repository;

import org.isj.gestionrdvapp.api.domaine.entities.Rdv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RdvRepository extends JpaRepository<Rdv, Long> {

    Rdv findByIdRdv(Long idRdv);

    //@Query("SELECT  FROM Rdv ")
    //List<Rdv> findAdminByIdRdv(@Param("idRdv") int idRdv);
}
