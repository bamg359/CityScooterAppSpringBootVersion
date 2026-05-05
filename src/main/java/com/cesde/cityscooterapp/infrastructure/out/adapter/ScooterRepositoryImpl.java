package com.cesde.cityscooterapp.infrastructure.out.adapter;
import com.cesde.cityscooterapp.domain.Scooter;

import java.util.ArrayList;
import java.util.List;

public class ScooterRepositoryImpl {


    List<Scooter> scooters = new ArrayList<>(

            new ArrayList<>()

    );


    public Scooter save(Scooter scooter){
        scooters.add(scooter);
        return scooter;

    }


}
