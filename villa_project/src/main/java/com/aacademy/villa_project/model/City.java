package com.aacademy.villa_project.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class City {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String cityName;

    @OneToMany(orphanRemoval = true)
    private Set<Location> locations;


}
