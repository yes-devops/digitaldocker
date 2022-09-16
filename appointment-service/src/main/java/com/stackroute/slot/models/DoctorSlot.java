package com.stackroute.slot.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class DoctorSlot {

    @Id
    private String slotId= UUID.randomUUID().toString();
    private String doctorEmailId;
    private String specialization;
    private LocalDate slotDate;
    private LocalTime slotStartTime;
    private LocalTime slotEndTime;
    private SlotStatus slotStatus;
	public String getSlotId() {
		return slotId;
	}
	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}
	public String getDoctorEmailId() {
		return doctorEmailId;
	}
	public void setDoctorEmailId(String doctorEmailId) {
		this.doctorEmailId = doctorEmailId;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public LocalDate getSlotDate() {
		return slotDate;
	}
	public void setSlotDate(LocalDate slotDate) {
		this.slotDate = slotDate;
	}
	public LocalTime getSlotStartTime() {
		return slotStartTime;
	}
	public void setSlotStartTime(LocalTime slotStartTime) {
		this.slotStartTime = slotStartTime;
	}
	public LocalTime getSlotEndTime() {
		return slotEndTime;
	}
	public void setSlotEndTime(LocalTime slotEndTime) {
		this.slotEndTime = slotEndTime;
	}
	public SlotStatus getSlotStatus() {
		return slotStatus;
	}
	public void setSlotStatus(SlotStatus slotStatus) {
		this.slotStatus = slotStatus;
	}
    
    


}
