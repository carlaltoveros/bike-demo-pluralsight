package com.projects.globomatics.bike.controllers;

import com.projects.globomatics.bike.models.Bike;
import com.projects.globomatics.bike.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    private BikeRepository bikeRepository;

    @Autowired
    public BikesController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping
    public List<Bike> list() {
        return bikeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike) {
        bikeRepository.save(bike);
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id) {
        return bikeRepository.getById(id);
    }

}
