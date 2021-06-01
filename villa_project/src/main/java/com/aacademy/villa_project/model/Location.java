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
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String cityPart;

    @Column(unique = true, nullable = false)
    private String street;

    @Column(unique = true, nullable = false)
    private Integer streetNumber;

    @OneToMany
    private Set<Villa> villas;

}
