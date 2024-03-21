package com.example.docms.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
    @Query("SELECT d FROM Doctor d WHERE d.speciality=?1")
    List<Doctor> findDoctorsByDocSpeciality(String speciality);
}
