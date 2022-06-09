package com.HMS.HMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HMS.HMS.ServiceImpl.PatientServiceImpl;
import com.HMS.HMS.entity.Patient;
import com.HMS.HMS.exception.PatientNotFoundException;
import com.HMS.HMS.service.PatientService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {
	@Autowired
	PatientService patientService;
	 
	   @GetMapping("/patients/patient/{id}")
	    public Patient showPatientInformation(@PathVariable Integer id){
	        Patient patient = patientService.showPatientInformation(id);
	        if(patient == null){
	            throw new PatientNotFoundException(id + " is not in database");
	        }
	        return patient;
	    }

	    @PostMapping("patients/patient")
	    public boolean createPatient(@RequestBody Patient patient){
	        patientService.savePatientInformation(patient);
	        return true;
	    }

}
