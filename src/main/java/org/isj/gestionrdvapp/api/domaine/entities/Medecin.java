package org.isj.gestionrdvapp.api.domaine.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medecin")
public class Medecin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numOrdre;

    private String nom;
    private String prenom;
    private String specialite;
    private int telephone;
    private String email;


    public Medecin() {super();}

    public Medecin(Long num_ordre, String nom, String prenom, String specialite, int telephone, String email, String localisation){

        super();
        this.numOrdre =num_ordre;
        this.nom=nom;
        this.prenom=prenom;
        this.specialite=specialite;
        this.telephone=telephone;
        this.email=email;

    }

    public Long getNumOrdre() {
        return numOrdre;
    }

    public void setNumOrdre(Long numOrdre) {
        this.numOrdre = numOrdre;
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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
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


    @Override
    public String toString() {
        return "Medecin{" +
                "numOrdre=" + numOrdre +
                ", nom='" + nom +
                ", prenom='" + prenom +
                ", specialite='" + specialite +
                ", telephone=" + telephone +
                ", email='" + email +
                '}';
    }
}
