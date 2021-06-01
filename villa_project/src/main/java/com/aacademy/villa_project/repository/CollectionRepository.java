package com.aacademy.villa_project.repository;

import com.aacademy.villa_project.model.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Long> {

     Optional<Collection> findByRegion(String region);
}
