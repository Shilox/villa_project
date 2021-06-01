package com.aacademy.villa_project.service;

import com.aacademy.villa_project.repository.CollectionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class CollectionServiceTest {

    @Mock
    private CollectionRepository collectionRepository;

    private CollectionService collectionService;

    @BeforeEach
    public void setUp(){
        collectionService = new CollectionService(collectionRepository);

    }

    @Test
    void findByRegion() {


    }
}