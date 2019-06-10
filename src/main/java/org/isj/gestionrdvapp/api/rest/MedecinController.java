package org.isj.gestionrdvapp.api.rest;

import com.google.common.collect.Lists;
import org.isj.gestionrdvapp.api.domaine.dto.MedecinDto;
import org.isj.gestionrdvapp.api.domaine.entities.Medecin;
import org.isj.gestionrdvapp.api.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/allodocteur/api")
public class MedecinController {


    //injection de methode
    @Autowired
    private IService service;


    @RequestMapping(value="/listemedecin", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MedecinDto> listMedecins() {

        final List<Medecin> medecins = service.getAllMedecin();


        final List<MedecinDto> dtos= Lists.transform(medecins, (Medecin input) -> new MedecinDto(
                input.getNumOrdre(), input.getNom(),input.getPrenom(),input.getTelephone(), input.getEmail(),input.getSpecialite()
                ));

        return dtos;





    }

    @RequestMapping(value = "/creermedecin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public MedecinDto saveMedecin(@RequestBody MedecinDto medecinDto) {

        Medecin medecin = new Medecin();
        medecin.setNumOrdre(medecinDto.getNum_ordre());
        medecin.setNom(medecinDto.getNom());
        medecin.setPrenom(medecinDto.getPrenom());
        medecin.setTelephone(medecinDto.getTelephone());
        medecin.setEmail(medecinDto.getEmail());
        medecin.setSpecialite(medecinDto.getSpecialite());


        medecin = service.saveMedecin(medecin);

        return new MedecinDto(medecin.getNumOrdre(), medecin.getNom(), medecin.getPrenom(), medecin.getTelephone(),
                medecin.getEmail(), medecin.getSpecialite());

    }
}
