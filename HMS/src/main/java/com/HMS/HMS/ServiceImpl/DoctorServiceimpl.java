package com.HMS.HMS.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.HMS.HMS.Repository.DoctorRepo;
import com.HMS.HMS.entity.Doctor;
import com.HMS.HMS.service.DoctorService;
@Repository
@Transactional
public class DoctorServiceimpl implements DoctorService {
	@Autowired
	DoctorRepo doctorRepo;

	@Override
	public Doctor showDoctorInformation(String name) {
		// TODO Auto-generated method stub
		return doctorRepo.findByName(name);
	}

	@Override
	public boolean saveDoctorInformation(Doctor doctor) {
		// TODO Auto-generated method stub
		 doctorRepo.save(doctor);
		return true;
	}

	@Override
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return (List<Doctor>) doctorRepo.findAll();
	}
	

}
