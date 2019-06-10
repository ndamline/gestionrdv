package org.isj.gestionrdvapp.api.domaine.entities;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long idAdmin;
        private String nom;
        private String prenom;


        public Long getIdAdmin() {
            return idAdmin;
        }

        public void setIdAdmin(Long idAdmin) {
            this.idAdmin = idAdmin;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public Admin(Long idAdmin, String nom, String prenom) {
            this.idAdmin = idAdmin;
            this.nom = nom;
            this.prenom = prenom;
        }

        @Override
        public String toString() {
            return "EmploiDeTemps{" +
                    "idAdmin=" + idAdmin +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    '}';
        }



}
