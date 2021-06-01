package com.aacademy.villa_project.repository;

import com.aacademy.villa_project.model.Villa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VillaRepository extends JpaRepository<Villa, Long> {
    Optional<Villa> findByVilla(String name, Integer numberOfPeople, String rooms, String bathrooms, Integer priceOfVilla);
}
