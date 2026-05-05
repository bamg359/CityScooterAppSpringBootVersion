package com.cesde.cityscooterapp.application;

import com.cesde.cityscooterapp.application.inpurport.VehiculeService;
import com.cesde.cityscooterapp.domain.Vehicule;
import com.cesde.cityscooterapp.infrastructure.out.adapter.VehiculeRepositoryImpl;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class VehiculeServiceImp implements VehiculeService {


    private final VehiculeRepositoryImpl vehiculeRepositoryImpl;



    public VehiculeServiceImp(VehiculeRepositoryImpl vehiculeRepositoryImpl) {
        this.vehiculeRepositoryImpl = vehiculeRepositoryImpl;
    }


    @Override
    public Vehicule CreateVehicule(Vehicule vehicule) {
        return null;
    }

    @Override
    public Vehicule UpdateVehicule(Vehicule vehicule) {
        return null;
    }

    @Override
    public Vehicule GetVehiculeById(Integer idVehicule) {
        return null;
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return List.of();
    }

    @Override
    public Boolean deleteVehicule(Integer idVehicule) {
        return null;
    }

}
