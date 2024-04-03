package com.example.docms.controller;

import com.example.docms.data.Doctor;
import com.example.docms.service.DoctorService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping(path = "/doctors")
    public Doctor createDoctor(@RequestBody Doctor doctor){
        return doctorService.createDoctor(doctor);
    }

    @GetMapping(path = "/doctors/{id}")
    public Doctor getDoctorById(@PathVariable int id){
        return doctorService.getDoctorById(id);
    }

    @PutMapping(path = "/doctors")
    public Doctor updateDoctor(@RequestBody Doctor doctor){
        return doctorService.updateDoctor(doctor);
    }

    @GetMapping(path = "/doctors")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @GetMapping(path = "/doctors", params = {"speciality"})
    public List<Doctor> getAllDoctorsBySpeciality(@RequestParam String speciality){
        return doctorService.getAllDoctorsBySpeciality(speciality);
    }

    @DeleteMapping(path = "/doctors/{id}")
    public void deleteDoctorById(@PathVariable int id){
        doctorService.deleteDoctorById(id);
    }
}
