package com.example.docms.service;

import com.example.docms.data.Doctor_Availability;
import com.example.docms.data.Doctor_AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class Doctor_AvailabilityService {

    @Autowired
    private Doctor_AvailabilityRepository doctor_availabilityRepository;

    public Doctor_Availability createDocAvailability(Doctor_Availability doctor_availability){
        return doctor_availabilityRepository.save(doctor_availability);
    }

    public Doctor_Availability updateDocAvailability(Doctor_Availability doctor_availability){
        return doctor_availabilityRepository.save(doctor_availability);
    }

    public List<Doctor_Availability> getDocAvailabilityByDocIdAndDate(int id, String date){
        return doctor_availabilityRepository.findDoctorAvailabilityByDocIdAndDate(id, date);
    }

    public void deleteDocAvailabilityById(int id){
        doctor_availabilityRepository.deleteById(id);
    }
}
