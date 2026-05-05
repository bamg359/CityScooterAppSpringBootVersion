package com.cesde.cityscooterapp.application.inpurport;

import com.cesde.cityscooterapp.domain.Scooter;

import java.util.List;

public interface ScooterService {

    Scooter createScooter(Scooter scooter);

    Scooter updateScooter(Scooter scooter);

    List<Scooter> getAllScooters();

    Scooter getScooterById(Integer idScooter);

    Boolean deleteScooter(Integer idScooter);

    Scooter method(Scooter scooter);



}
