package com.example.docms.service;

import com.example.docms.data.Doctor;
import com.example.docms.data.DoctorRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor createDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public Doctor updateDoctor(Doctor doctor){
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(int id){
        Optional<Doctor> doctor= doctorRepository.findById(id);
        return doctor.orElse(null);
    }

    public Doctor getDoctorByName(String doc_name){
        return doctorRepository.findDoctorByDocName(doc_name);
    }

    public List<Doctor> getAllDoctorsBySpeciality(String speciality){
        return doctorRepository.findDoctorsByDocSpeciality(speciality);
    }

    public void deleteDoctorById(int id){
        doctorRepository.deleteById(id);
    }

}
