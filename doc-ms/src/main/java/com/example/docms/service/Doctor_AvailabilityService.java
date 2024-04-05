package com.example.docms.service;

import com.example.docms.data.Doctor_Availability;
import com.example.docms.data.Doctor_AvailabilityRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class Doctor_AvailabilityService {

    private final Doctor_AvailabilityRepository doctor_availabilityRepository;

    public Doctor_AvailabilityService(Doctor_AvailabilityRepository doctor_availabilityRepository) {
        this.doctor_availabilityRepository = doctor_availabilityRepository;
    }

    public Doctor_Availability createDocAvailability(Doctor_Availability doctor_availability){
        return doctor_availabilityRepository.save(doctor_availability);
    }

    public Doctor_Availability updateDocAvailability(Doctor_Availability doctor_availability){
        return doctor_availabilityRepository.save(doctor_availability);
    }

    public List<Doctor_Availability> getDocAvailabilityByDocIdAndDate(int id, LocalDate date){
        return doctor_availabilityRepository.findDoctorAvailabilityByDocIdAndDate(id, date);
    }

    public void deleteDocAvailabilityById(int id){
        doctor_availabilityRepository.deleteById(id);
    }
}
