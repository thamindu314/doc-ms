package com.example.docms.service;

import com.example.docms.data.Doctor;
import com.example.docms.data.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor createDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public Doctor getDoctorByID(int id){
        Optional<Doctor> doctor= doctorRepository.findById(id);
        if(doctor.isPresent()){
            return doctor.get();
        }
        return null;
    }

    public Doctor updateDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public void deleteDoctor(int id){
        doctorRepository.deleteById(id);
    }
}
