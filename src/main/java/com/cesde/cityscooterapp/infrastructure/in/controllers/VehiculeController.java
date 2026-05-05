package com.cesde.cityscooterapp.infrastructure.in.controllers;

import com.cesde.cityscooterapp.domain.Vehicule;
import com.cesde.cityscooterapp.application.inpurport.VehiculeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Vehicule")
public class VehiculeController {

    private final VehiculeService vehiculeService;


    public VehiculeController(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }


    @PostMapping("/create")
    public Vehicule createVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.CreateVehicule(vehicule);
    }

    @PutMapping("/update")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.UpdateVehicule(vehicule);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteVehicule(@PathVariable Integer id) {
        return vehiculeService.deleteVehicule(id);
    }

    @GetMapping("/all")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }

    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable Integer id) {
        return vehiculeService.GetVehiculeById(id);
    }




}
