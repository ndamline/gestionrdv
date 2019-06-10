package org.isj.gestionrdvapp.api.rest;

import com.google.common.collect.Lists;

import org.isj.gestionrdvapp.api.domaine.dto.PatientDto;
import org.isj.gestionrdvapp.api.domaine.entities.Patient;
import org.isj.gestionrdvapp.api.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/allodocteur/api")
public class PatientController {
	//injection de methode
	@Autowired
	private IService service;

	@RequestMapping(value="/listepatient", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PatientDto> listPatients() {

		final List<Patient> patients = service.getAllPatient();


		final List<PatientDto> dtos=Lists.transform(patients, (Patient input) -> new PatientDto(
				input.getNom(),input.getPrenom(),input.getDateNaissance(),input.getSexe(),input.getEmail(),input.getTelephone()));

		return dtos;
	}

	@RequestMapping(value = "/creerpatient", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public PatientDto savePatient(@RequestBody PatientDto patientDto) {

		Patient patient = new Patient();
		patient.setNom(patientDto.getNom());
		patient.setPrenom(patientDto.getPrenom());
		patient.setDateNaissance(patientDto.getDateNaissance());
		patient.setSexe(patientDto.getSexe());
		patient.setEmail(patientDto.getEmail());
		patient.setTelephone(patientDto.getTelephone());

		patient= service.savePatient(patient);

		return new PatientDto(patient.getNom(),patient.getPrenom(), patient.getDateNaissance(), patient.getSexe(),
				patient.getEmail(), patient.getTelephone());
	}

	@RequestMapping(value = "/enseignant/{telephone}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public PatientDto getPatientByTelephone(@PathVariable String telephone) {

		final Patient patient= service.recherchePatient(telephone);

		return new PatientDto(patient.getNom(),patient.getPrenom(), patient.getDateNaissance(), patient.getSexe(),
				patient.getEmail(), patient.getTelephone());
	}

}
