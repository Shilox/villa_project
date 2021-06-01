package com.aacademy.villa_project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationDto {

    private Long id;
    private String cityPart;
    private String street;
    private Integer streetNumber;


}
