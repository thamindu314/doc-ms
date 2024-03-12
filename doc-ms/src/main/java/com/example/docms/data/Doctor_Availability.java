package com.example.docms.data;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "doctor_availability")
public class Doctor_Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int availability_id;
    @Column(name = "Doctor_ID")
    private int doc_id;
    @Column(name = "Available_Date")
    private LocalDate available_date;
    @Column(name = "Start_Time")
    private LocalTime start_time;
    @Column(name = "End_Time")
    private LocalTime end_time;

    public int getAvailability_id() {
        return availability_id;
    }

    public void setAvailability_id(int availability_id) {
        this.availability_id = availability_id;
    }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public LocalDate getAvailable_date() {
        return available_date;
    }

    public void setAvailable_date(LocalDate available_date) {
        this.available_date = available_date;
    }

    public LocalTime getStart_time() {
        return start_time;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public LocalTime getEnd_time() {
        return end_time;
    }

    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }
}
