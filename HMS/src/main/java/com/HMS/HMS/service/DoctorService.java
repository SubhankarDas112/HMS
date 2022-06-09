package com.HMS.HMS.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.HMS.HMS.entity.Doctor;
public interface DoctorService {
	 public Doctor showDoctorInformation(String name);
	 public boolean saveDoctorInformation(Doctor doctor);
	 public List<Doctor> getDoctors();
}
