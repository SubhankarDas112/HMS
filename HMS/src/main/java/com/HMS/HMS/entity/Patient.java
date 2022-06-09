package com.HMS.HMS.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Patient {
		@Id
	    @GeneratedValue
	    private Integer id;
	    private String name;
	    private Integer age;
	    @Column(unique = true)
	    private String doctorName;
	    private LocalDate dateOfvisit;
	    private String gender;
	    private String prescription;
		public Patient() {
			
		}
		public Patient(Integer id, String name, Integer age, String doctorName, LocalDate dateOfvisit, String gender,
				String prescription) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.doctorName = doctorName;
			this.dateOfvisit = dateOfvisit;
			this.gender = gender;
			this.prescription = prescription;
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
		public String getDoctorName() {
			return doctorName;
		}
		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}
		public LocalDate getDateOfvisit() {
			return dateOfvisit;
		}
		public void setDateOfvisit(LocalDate dateOfvisit) {
			this.dateOfvisit = dateOfvisit;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPrescription() {
			return prescription;
		}
		public void setPrescription(String prescription) {
			this.prescription = prescription;
		}
		@Override
		public String toString() {
			return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", doctorName=" + doctorName
					+ ", dateOfvisit=" + dateOfvisit + ", gender=" + gender + ", prescription=" + prescription + "]";
		}
		
	    
	    
}
