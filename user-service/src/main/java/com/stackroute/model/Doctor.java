package com.stackroute.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document
public class Doctor {
    @Id
    private String emailId;
    private String specialization;
    private double yearsOfExperience;
    private String doctorName;
    private String password;
    private String city;
    private String image;
    private Long doctorMobileNumber;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public double getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getDoctorMobileNumber() {
		return doctorMobileNumber;
	}
	public void setDoctorMobileNumber(Long doctorMobileNumber) {
		this.doctorMobileNumber = doctorMobileNumber;
	}

    
    
}




