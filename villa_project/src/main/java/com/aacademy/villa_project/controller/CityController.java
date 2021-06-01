package com.aacademy.villa_project.controller;

import com.aacademy.villa_project.dto.CityDto;
import com.aacademy.villa_project.service.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cities")
public class CityController {

    private final CityService cityService;


    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "{city}")
    public ResponseEntity<CityDto> findByCity(@PathVariable String cityName){
        return ResponseEntity.ok(cityService.findByCity(cityName));
    }
}
