package com.cesde.cityscooterapp.infrastructure.in.controllers;


import com.cesde.cityscooterapp.domain.Scooter;
import com.cesde.cityscooterapp.application.inpurport.ScooterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Scooter")
public class ScooterController {



    private final ScooterService scooterService;

    public ScooterController(ScooterService scooterService) {
        this.scooterService = scooterService;
    }

    @PostMapping("/create")
    public Scooter createScooter(@RequestBody Scooter scooter) {
        return scooterService.createScooter(scooter);
    }

    @PutMapping("/update")
    public Scooter updateScooter(@RequestBody Scooter scooter) {
        return scooterService.updateScooter(scooter);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteScooter(@PathVariable Integer id) {
        return scooterService.deleteScooter(id);
    }



    @GetMapping("/all")
    public List<Scooter> getAllScooters() {
        return scooterService.getAllScooters();
    }


    @GetMapping("/{id}")
    public Scooter getScooterById(@PathVariable Integer id) {
        return scooterService.getScooterById(id);
    }



    @PostMapping("/method")
    public Scooter method(@RequestBody Scooter scooter) {
        return scooterService.method(scooter);
    }





}
