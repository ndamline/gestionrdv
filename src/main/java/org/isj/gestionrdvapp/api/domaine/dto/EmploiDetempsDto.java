package org.isj.gestionrdvapp.api.domaine.dto;

import java.io.Serializable;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class EmploiDetempsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idEmploi;
    private String hdebut;
    private String hfin;
    private String jour;
    private String jourRdv ;

    public EmploiDetempsDto(){super();}
    public EmploiDetempsDto(Long idEmploi, String hdebut, String hfin, String jourRdv){
        this.idEmploi=idEmploi;
        this.hdebut=hdebut;
        this.hfin=hfin;
        this.jourRdv=jourRdv;
    }

   /* public String toString() {
        StringBuffer str = new StringBuffer("");
        for (RdvDto rdv : jourRdv ) {
            str.append(" ");
            str.append(rdv.toString());
        }
        return String.format("Agenda[%s,%s,%s]", medecin, new SimpleDateFormat("dd/MM/yyyy").format(jour), str.toString());
    }
*/
    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    @Override
    public String toString() {
        return "EmploiDetempsDto{" +
                "idEmploi=" + idEmploi +
                ", hdebut='" + hdebut + '\'' +
                ", hfin='" + hfin + '\'' +
                ", jourRdv='" + jourRdv + '\'' +
                '}';
    }
}
