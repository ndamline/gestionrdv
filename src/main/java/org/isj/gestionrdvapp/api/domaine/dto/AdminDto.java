package org.isj.gestionrdvapp.api.domaine.dto;

import java.io.Serializable;

public class AdminDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idAdmin;
    private String nom;
    private String prenom;


    public AdminDto(){super();}
    public AdminDto(int idAdmin, String nom, String prenom){
        this.idAdmin=idAdmin;
        this.nom=nom;
        this.prenom=prenom;
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
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

    @Override
    public String toString() {
        return "AdminDto{" +
                "idAdmin=" + idAdmin +
                ", nom='" + nom +
                ", prenom='" + prenom +
                '}';
    }
}
