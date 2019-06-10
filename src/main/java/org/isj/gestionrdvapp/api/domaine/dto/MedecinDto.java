package org.isj.gestionrdvapp.api.domaine.dto;

import java.io.Serializable;

public class MedecinDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long num_ordre;
    private String nom;
    private String prenom;

    private int telephone;
    private String email;
    private String specialite;

    public MedecinDto(){super();}

    public MedecinDto(Long num_ordre, String nom, String prenom,  int telephone, String email,String specialite){
        super();
        this.num_ordre=num_ordre;
        this.nom=nom;
        this.prenom=prenom;

        this.email=email;
        this.telephone=telephone;
        this.specialite=specialite;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getNum_ordre() {
        return num_ordre;
    }

    public void setNum_ordre(Long num_ordre) {
        this.num_ordre = num_ordre;
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




    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }



    @Override
    public String toString() {
        return "MedecinDto{" +
                "num_ordre=" + num_ordre +
                ", nom='" + nom +
                ", prenom='" + prenom +

                ", telephone=" + telephone +
                ", email='" + email +
                ", specialite='" + specialite +
                '}';
    }


}
