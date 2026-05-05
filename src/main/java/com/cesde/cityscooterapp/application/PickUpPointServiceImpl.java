package com.cesde.cityscooterapp.application;


import com.cesde.cityscooterapp.application.inpurport.PickUpPointService;
import com.cesde.cityscooterapp.domain.PickUpPoint;
import com.cesde.cityscooterapp.infrastructure.out.adapter.PickUpPointRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class PickUpPointServiceImpl implements PickUpPointService {


    private final PickUpPointRepositoryImpl pickUpPointRepositoryImpl;

    public PickUpPointServiceImpl(PickUpPointRepositoryImpl pickUpPointRepositoryImpl) {
        this.pickUpPointRepositoryImpl = pickUpPointRepositoryImpl;
    }

    @Override
    public PickUpPoint createPickUpPoint(PickUpPoint pickUpPoint) {
        return null;
    }

    @Override
    public PickUpPoint updatePickUpPoint(PickUpPoint pickUpPoint) {
        return null;
    }

    @Override
    public List<PickUpPoint> getAllPickUpPoints() {
        return List.of();
    }

    @Override
    public PickUpPoint getPickUpPointById(Integer idPoint) {
        return null;
    }

    @Override
    public Boolean deletePickUpPoint(Integer idPoint) {
        return null;
    }
}
