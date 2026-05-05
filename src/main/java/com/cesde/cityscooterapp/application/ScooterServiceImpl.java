package com.cesde.cityscooterapp.application;


import com.cesde.cityscooterapp.application.inpurport.ScooterService;
import com.cesde.cityscooterapp.domain.Scooter;
import com.cesde.cityscooterapp.infrastructure.out.adapter.ScooterRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScooterServiceImpl implements ScooterService {



    private final ScooterRepositoryImpl scooterRepositoryImpl;


    public ScooterServiceImpl(ScooterRepositoryImpl scooterRepositoryImpl) {
        this.scooterRepositoryImpl = scooterRepositoryImpl;
    }

    @Override
    public Scooter createScooter(Scooter scooter) {
        return null;
    }

    @Override
    public Scooter updateScooter(Scooter scooter) {
        return null;
    }

    @Override
    public List<Scooter> getAllScooters() {
        return List.of();
    }

    @Override
    public Scooter getScooterById(Integer idScooter) {
        return null;
    }

    @Override
    public Boolean deleteScooter(Integer idScooter) {
        return null;
    }

    @Override
    public Scooter method(Scooter scooter) {
        return null;
    }

}
