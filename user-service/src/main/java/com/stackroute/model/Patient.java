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
public class Patient {
    @Id
    private String emailId;
    private String patientName;
    private long patientMobileNumber;
    private String password;
    private String city;
    private String patientImage;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getPatientMobileNumber() {
		return patientMobileNumber;
	}
	public void setPatientMobileNumber(long patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
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
	public String getPatientImage() {
		return patientImage;
	}
	public void setPatientImage(String patientImage) {
		this.patientImage = patientImage;
	}
    
    
    
}