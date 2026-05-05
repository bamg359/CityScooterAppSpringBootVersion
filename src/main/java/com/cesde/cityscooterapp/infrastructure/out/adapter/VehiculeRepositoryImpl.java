package com.cesde.cityscooterapp.infrastructure.out.adapter;

import com.cesde.cityscooterapp.domain.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class VehiculeRepositoryImpl {

    List<Vehicule> vehicules = new ArrayList<>(

            new ArrayList<>()

    );


    public Vehicule save(Vehicule vehicule){
        vehicules.add(vehicule);
        return vehicule;

    }


}
