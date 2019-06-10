package org.isj.gestionrdvapp.api.domaine.dto;

import java.io.Serializable;
import java.util.Date;

public class RdvDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idRdv;
    private Date jourRdv;

    public RdvDto(){super();}

    public RdvDto(int idRdv, Date jourRdv){

        this.idRdv=idRdv;
        this.jourRdv=jourRdv;
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getIdRdv() {
        return idRdv;
    }

    public void setIdRdv(int idRdv) {
        this.idRdv = idRdv;
    }

    public Date getJourRdv() {
        return jourRdv;
    }

    public void setJourRdv(Date jourRdv) {
        this.jourRdv = jourRdv;
    }

    @Override
    public String toString() {
        return "RdvDto{" +
                "idRdv=" + idRdv +
                ", jourRdv=" + jourRdv +
                '}';
    }
}
