package com.aacademy.villa_project.controller;

import com.aacademy.villa_project.dto.CollectionDto;
import com.aacademy.villa_project.service.CollectionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/collections")
public class CollectionController {

    private final CollectionService collectionService;

    public CollectionController(CollectionService collectionService) {
        this.collectionService = collectionService;
    }


    @GetMapping(value = "{region}")
    public ResponseEntity<CollectionDto> findByRegion(@PathVariable String region){
        return ResponseEntity.ok(collectionService.findByRegion(region));
    }
}
