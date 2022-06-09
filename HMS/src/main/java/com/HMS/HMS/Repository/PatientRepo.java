package com.HMS.HMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.HMS.HMS.entity.Patient;
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface PatientRepo extends JpaRepository<Patient,Integer> {

}
