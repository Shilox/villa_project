package com.aacademy.villa_project.controller;

import com.aacademy.villa_project.dto.VillaDto;
import com.aacademy.villa_project.service.VillaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/villas")
public class VillaController {

    private final VillaService villaService;

    public VillaController(VillaService villaService) {
        this.villaService = villaService;
    }

    @GetMapping(value = "{villa}")
    public ResponseEntity<VillaDto> findByVilla(@PathVariable String name, Integer numberOfPeople, String rooms, String bathrooms, Integer priceOfVilla ){

        return ResponseEntity.ok(villaService.findByVilla(name, numberOfPeople, rooms, bathrooms, priceOfVilla));
    }

}
