package com.cesde.cityscooterapp.infrastructure.in.controllers;


import com.cesde.cityscooterapp.domain.PickUpPoint;
import com.cesde.cityscooterapp.application.inpurport.PickUpPointService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/PickUpPoint")
public class PickUpPointController {

    private final PickUpPointService pickUpPointService;


    public PickUpPointController(PickUpPointService pickUpPointService) {
        this.pickUpPointService = pickUpPointService;
    }


    @PostMapping("/create")
    public PickUpPoint createPickUpPoint(@RequestBody PickUpPoint pickUpPoint) {
        return pickUpPointService.createPickUpPoint(pickUpPoint);
    }


    @PutMapping("/update")
    public PickUpPoint updatePickUpPoint(@RequestBody PickUpPoint pickUpPoint) {
        return pickUpPointService.updatePickUpPoint(pickUpPoint);
    }


    @GetMapping("/all")
    public List<PickUpPoint> getAllPickUpPoints() {
        return pickUpPointService.getAllPickUpPoints();
    }


    @GetMapping("/{id}")
    public PickUpPoint getPickUpPointById(@PathVariable Integer id) {
        return pickUpPointService.getPickUpPointById(id);
    }


    @DeleteMapping("/delete/{id}")
    public Boolean deletePickUpPoint(@PathVariable Integer id) {
        return pickUpPointService.deletePickUpPoint(id);
    }
}
