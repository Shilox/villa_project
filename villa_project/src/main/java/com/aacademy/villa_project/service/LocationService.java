package com.aacademy.villa_project.service;

import com.aacademy.villa_project.dto.LocationDto;
import com.aacademy.villa_project.exception.NotFoundException;
import com.aacademy.villa_project.model.Location;
import com.aacademy.villa_project.repository.LocationRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }



    public LocationDto findByLocation(@NonNull String cityPart, String street, Integer streetNumber){
        Location location = locationRepository.findByLocation(cityPart, street, streetNumber)
                .orElseThrow(() -> new NotFoundException(String.format("Location %s not found", cityPart, street, streetNumber)));

        return LocationDto.builder()
                .id(location.getId())
                .cityPart(location.getCityPart())
                .street(location.getStreet())
                .build();
    }


}
