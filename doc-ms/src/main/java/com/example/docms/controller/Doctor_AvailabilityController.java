package com.example.docms.controller;

import com.example.docms.data.Doctor_Availability;
import com.example.docms.service.Doctor_AvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class Doctor_AvailabilityController {

    @Autowired
    private Doctor_AvailabilityService doctor_availabilityService;

    @PostMapping(path = "/doctor_availabilities")
    public Doctor_Availability createDocAvailability(@RequestBody Doctor_Availability doctor_availability){
        return doctor_availabilityService.createDocAvailability(doctor_availability);
    }

    @PutMapping(path = "/doctor_availabilities")
    public Doctor_Availability updateDocAvailability(@RequestBody Doctor_Availability doctor_availability){
        return doctor_availabilityService.updateDocAvailability(doctor_availability);
    }

    @GetMapping(path = "/doctor_availabilities", params = {"id","available_date"})
    public List<Doctor_Availability> getDocAvailabilityByDocIDAndDate(@RequestParam int id,@RequestParam String available_date){
        LocalDate localDate = LocalDate.parse(available_date);
        return doctor_availabilityService.getDocAvailabilityByDocIDAndDate(id, localDate);
    }

    @DeleteMapping(path = "/doctor_availabilities/{id}")
    public void deleteDocAvailability(@PathVariable int id){
        doctor_availabilityService.deleteDocAvailability(id);
    }
}
