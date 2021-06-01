package com.aacademy.villa_project.repository;

import com.aacademy.villa_project.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    Optional<Location> findByLocation(String cityPart, String street, Integer streetNumber);
}
