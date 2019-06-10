package org.isj.gestionrdvapp.api.rest;


import org.isj.gestionrdvapp.api.domaine.dto.EmploiDetempsDto;
import org.isj.gestionrdvapp.api.domaine.entities.EmploiDeTemps;
import org.isj.gestionrdvapp.api.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allodocteur/api")
public class EmploiDeTempsController {


    //injection de methode
    @Autowired
    private IService service;


    @RequestMapping(value = "/creeremploidetemps", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public EmploiDetempsDto creerEmploiDeTemps(@RequestBody EmploiDetempsDto emploiDetempsDto) {

        EmploiDeTemps emploiDetemps = new EmploiDeTemps();
        emploiDetemps.setIdEmploi( emploiDetemps.getIdEmploi());
        emploiDetemps.setHdebut(emploiDetemps.getHdebut());
        emploiDetemps.setHfin(emploiDetemps.getHfin());
        emploiDetemps.setJourRdv(emploiDetemps.getJourRdv());




        emploiDetemps = service.creerEmploiDeTemps(emploiDetemps);

        return new EmploiDetempsDto(emploiDetemps.getIdEmploi(), emploiDetemps.getHdebut(), emploiDetemps.getHfin(),
                emploiDetemps.getJourRdv());

    }
}
