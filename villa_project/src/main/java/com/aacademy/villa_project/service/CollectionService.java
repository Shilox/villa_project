package com.aacademy.villa_project.service;


import com.aacademy.villa_project.dto.CollectionDto;
import com.aacademy.villa_project.exception.NotFoundException;
import com.aacademy.villa_project.model.Collection;
import com.aacademy.villa_project.repository.CollectionRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class CollectionService {
    private final CollectionRepository collectionRepository;

    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public CollectionDto findByRegion(@NonNull String region){
        Collection collection = collectionRepository.findByRegion(region)
                .orElseThrow(() -> new NotFoundException(String.format("Collection %s not found", region)));

         return CollectionDto.builder()
                 .id(collection.getId())
                 .region(collection.getRegion())
                 .build();
    }

}
