package com.aacademy.villa_project.controller;

import com.aacademy.villa_project.dto.LocationDto;
import com.aacademy.villa_project.service.LocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping(value = "{location}")
    public ResponseEntity<LocationDto> findByLocation(@PathVariable String cityPart, String street, Integer streetNumber){
        return ResponseEntity.ok(locationService.findByLocation(cityPart, street, streetNumber));
    }
}
