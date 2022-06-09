package com.HMS.HMS.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFilter;
@Entity
@JsonFilter("DoctorFilter")
public class Doctor {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true)
    private String name;
    private Integer age;
    private String gender;
    private String specilization;
    private Integer patient_attendend=0;
    @OneToMany
    private List<Patient> patients;
    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatients(Patient patient) {
        patients.add(patient);
    }
   
	public Doctor() {
	// TODO Auto-generated constructor stub
	}
	public Doctor(Integer id, String name, Integer age, String gender, String specilization,
			Integer patient_attendend) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specilization = specilization;
		this.patient_attendend = patient_attendend;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecilization() {
		return specilization;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	public Integer getPatient_attendend() {
		return patient_attendend;
	}
	public void setPatient_attendend(Integer patient_attendend) {
		this.patient_attendend +=1;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", specilization="
				+ specilization + ", patient_attendend=" + patient_attendend + "]";
	}
    

}
