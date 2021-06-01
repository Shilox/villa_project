package com.aacademy.villa_project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Villa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private Integer numberOfPeople;

    @Column(unique = true, nullable = false)
    private String rooms;

    @Column(unique = true, nullable = false)
    private String bathrooms;

    @Column(unique = true, nullable = false)
    private Integer priceOfVilla;




}
