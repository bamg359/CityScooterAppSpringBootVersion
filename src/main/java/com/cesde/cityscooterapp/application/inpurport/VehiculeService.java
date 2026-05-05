package com.cesde.cityscooterapp.application.inpurport;

import com.cesde.cityscooterapp.domain.Vehicule;

import java.util.List;

public interface VehiculeService {

    Vehicule CreateVehicule(Vehicule vehicule);

    Vehicule UpdateVehicule(Vehicule vehicule);

    Vehicule GetVehiculeById(Integer idVehicule);

    List<Vehicule> getAllVehicules();

    Boolean deleteVehicule(Integer idVehicule);



}
