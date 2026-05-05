package com.cesde.cityscooterapp.infrastructure.out.adapter;

import com.cesde.cityscooterapp.domain.PickUpPoint;

import java.util.ArrayList;
import java.util.List;

public class PickUpPointRepositoryImpl {


    List<PickUpPoint> pickUpPoints = new ArrayList<>(

            new ArrayList<>()

    );


    public PickUpPoint save(PickUpPoint pickUpPoint){
        pickUpPoints.add(pickUpPoint);
        return pickUpPoint;

    }



}
