package org.isj.gestionrdvapp.api.domaine.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rdv")
public class Rdv {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRdv;
    private Date jourRdv;

    public Rdv() {super();}

    public Rdv(Long idRdv, Date jourRdv){

        super();
        this.idRdv=idRdv;
        this.jourRdv=jourRdv;

    }

    public Long getIdRdv() {
        return idRdv;
    }

    public void setIdRdv(Long idRdv) {
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
        return "Rdv{" +
                "idRdv=" + idRdv +
                ", jourRdv=" + jourRdv +
                '}';
    }
}
