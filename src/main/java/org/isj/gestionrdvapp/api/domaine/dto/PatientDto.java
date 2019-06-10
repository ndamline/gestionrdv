package org.isj.gestionrdvapp.api.domaine.dto;

import java.io.Serializable;
import java.util.Date;

public class PatientDto implements Serializable {

    private static final long serialVersionUID = 1L;


    private String nom;
    private String prenom;
    private String dateNaissance;
    private String sexe;
    private String email;
    private String telephone;


    public PatientDto(){super();}

    public PatientDto( String nom, String prenom, String dateNaissance, String sexe, String email, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.email = email;
        this.telephone = telephone;

    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public  String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public  String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }



    @Override
    public String toString() {
        return "PatientDto{" +

                ", nom='" + nom +
                ", prenom='" + prenom +
                ", dateNaissance=" + dateNaissance +
                ", sexe='" + sexe +
                ", email='" + email +
                ", telephone=" + telephone +

                '}';
    }
}
