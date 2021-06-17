package com.vams.registration.repository;

import com.vams.registration.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccineRepository extends JpaRepository <Vaccine, Integer> {
}
