package com.HMS.HMS.service;

import java.util.List;

import com.HMS.HMS.entity.Doctor;
import com.HMS.HMS.entity.Patient;

public interface PatientService  {
	public Patient showPatientInformation(Integer Id);
	 public boolean savePatientInformation(Patient patient);
	 public List<Patient> getPatientListOfDoctor(String name,Doctor doctor);
}
