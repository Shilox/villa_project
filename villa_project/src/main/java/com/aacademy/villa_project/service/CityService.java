package com.aacademy.villa_project.service;

import com.aacademy.villa_project.dto.CityDto;
import com.aacademy.villa_project.exception.NotFoundException;
import com.aacademy.villa_project.model.City;
import com.aacademy.villa_project.repository.CityRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public CityDto findByCity(@NonNull String cityName){
        City city = cityRepository.findByCity(cityName)
                .orElseThrow(() -> new NotFoundException(String.format("City %s not found", cityName)));

        return CityDto.builder()
                .id(city.getId())
                .cityName(city.getCityName())
                .build();
    }
}
