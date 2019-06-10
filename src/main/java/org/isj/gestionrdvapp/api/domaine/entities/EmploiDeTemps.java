package org.isj.gestionrdvapp.api.domaine.entities;


import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "emploidetemps")
public class EmploiDeTemps {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmploi;

    private String hdebut;
    private String hfin;
    private String jourRdv ;

    public EmploiDeTemps() {

    }

    public Long getIdEmploi() {
        return idEmploi;
    }

    public void setIdEmploi(Long idEmploi) {
        this.idEmploi = idEmploi;
    }

    public String getHdebut() {
        return hdebut;
    }

    public void setHdebut(String hdebut) {
        this.hdebut = hdebut;
    }

    public String getHfin() {
        return hfin;
    }

    public void setHfin(String hfin) {
        this.hfin = hfin;
    }

    public String getJourRdv() {
        return jourRdv;
    }

    public void setJourRdv(String jourRdv) {
        this.jourRdv = jourRdv;
    }

    public EmploiDeTemps(Long idEmploi, String hdebut, String hfin ,String jourRdv) {
        this.idEmploi = idEmploi;
        this.hdebut = hdebut;
        this.hfin = hfin;
        this.jourRdv = jourRdv;
    }

    @Override
    public String toString() {
        return "EmploiDeTemps{" +
                "idEmploi=" + idEmploi +
                ", hdebut=" + hdebut +
                ", jourRdv=" + jourRdv +

                '}';
    }
}
