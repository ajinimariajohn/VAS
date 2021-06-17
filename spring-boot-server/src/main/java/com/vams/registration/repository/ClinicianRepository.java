package com.vams.registration.repository;

import com.vams.registration.model.Clinician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicianRepository extends JpaRepository<Clinician, Integer> {
}
