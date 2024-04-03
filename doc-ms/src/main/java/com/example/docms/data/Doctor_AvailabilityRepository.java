package com.example.docms.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface Doctor_AvailabilityRepository extends JpaRepository<Doctor_Availability, Integer> {
    @Query("SELECT a FROM Doctor_Availability a WHERE a.doc_id=?1 and a.available_date=?2")
    List<Doctor_Availability> findDoctorAvailabilityByDocIdAndDate(int id, LocalDate date);
}


