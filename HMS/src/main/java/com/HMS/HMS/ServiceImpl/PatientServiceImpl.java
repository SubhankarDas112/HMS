package com.HMS.HMS.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.HMS.HMS.Repository.DoctorRepo;
import com.HMS.HMS.Repository.PatientRepo;
import com.HMS.HMS.entity.Doctor;
import com.HMS.HMS.entity.Patient;
import com.HMS.HMS.service.PatientService;
@Repository
@Transactional
public class PatientServiceImpl implements PatientService{
	@Autowired
	PatientRepo patientRepo;
	@Autowired
	DoctorRepo doctorRepo;

	@Override
	public Patient showPatientInformation(Integer Id) {
		// TODO Auto-generated method stub
		return patientRepo.findById(Id).get();
	}

	@Override
	public boolean savePatientInformation(Patient patient) {
		Doctor doctor = doctorRepo.findByName(patient.getDoctorName());
        doctor.addPatients(patient);
        patientRepo.save(patient);
        doctor.setPatient_attendend(null);
		return true;
	}

	@Override
	public List<Patient> getPatientListOfDoctor(String name, Doctor doctor) {
		// TODO Auto-generated method stub
		 return doctor.getPatients();
	}
	
}
