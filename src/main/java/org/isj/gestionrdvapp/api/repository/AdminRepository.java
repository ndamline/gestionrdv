package org.isj.gestionrdvapp.api.repository;

import org.isj.gestionrdvapp.api.domaine.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, Long> {


    Admin findByIdAdmin(Long idAmin);


    ///@Query("SELECT a FROM Admin a ")
   // Admin findByIdAdmin(Long idAdmin);


}
