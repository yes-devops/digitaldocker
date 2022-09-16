package com.stackroute.appointment.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;
@Document
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AppointmentSlot {
    @Id
    private String appointmentId= UUID.randomUUID().toString();
    private String slotId;
    private String patientEmail;
    private String doctorEmail;
    private String specialization;
    private LocalDate appointmentDate;
    private LocalTime appointmentStartTime;
    private LocalTime appointmentEndTime;
    private AppointmentStatus appointmentStatus;
    private LocalDate bookedOn=LocalDate.now();
	public String getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getSlotId() {
		return slotId;
	}
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public LocalTime getAppointmentStartTime() {
		return appointmentStartTime;
	}
	public void setAppointmentStartTime(LocalTime appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}
	public LocalTime getAppointmentEndTime() {
		return appointmentEndTime;
	}
	public void setAppointmentEndTime(LocalTime appointmentEndTime) {
		this.appointmentEndTime = appointmentEndTime;
	}
	public AppointmentStatus getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	public LocalDate getBookedOn() {
		return bookedOn;
	}
	public void setBookedOn(LocalDate bookedOn) {
		this.bookedOn = bookedOn;
	}



}
