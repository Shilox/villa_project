package com.aacademy.villa_project.service;

import com.aacademy.villa_project.dto.VillaDto;
import com.aacademy.villa_project.exception.NotFoundException;
import com.aacademy.villa_project.model.Villa;
import com.aacademy.villa_project.repository.VillaRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class VillaService {

    private final VillaRepository villaRepository;

    public VillaService(VillaRepository villaRepository) {
        this.villaRepository = villaRepository;
    }

    public VillaDto findByVilla(@NonNull  String name, Integer numberOfPeople, String rooms, String bathrooms, Integer priceOfVilla) {

        Villa villa = villaRepository.findByVilla(name, numberOfPeople, rooms, bathrooms, priceOfVilla)
                .orElseThrow(() -> new NotFoundException(String.format("Villa %s not found", name, numberOfPeople, rooms, bathrooms, priceOfVilla )));
        return VillaDto.builder()
                .id(villa.getId())
                .numberOfPeople(villa.getNumberOfPeople())
                .rooms(villa.getRooms())
                .bathrooms(villa.getBathrooms())
                .priceOfVilla(villa.getPriceOfVilla())
                .build();
    }
}
