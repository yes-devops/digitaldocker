package com.stackroute.slot.repository;

import com.stackroute.slot.models.DoctorSlot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DoctorSlotRepository extends MongoRepository<DoctorSlot, String> {

    List<DoctorSlot> findAllByDoctorEmailId(String doctorEmailId);

    List<DoctorSlot> findAllBySlotDate(LocalDate slotDate);


}

