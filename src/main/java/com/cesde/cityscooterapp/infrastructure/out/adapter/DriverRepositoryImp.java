package com.cesde.cityscooterapp.infrastructure.out.adapter;


import com.cesde.cityscooterapp.application.outputport.DriverPersistencePort;
import com.cesde.cityscooterapp.domain.Driver;
import com.cesde.cityscooterapp.infrastructure.out.mapper.DriverMapper;
import com.cesde.cityscooterapp.infrastructure.out.repository.DriverRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DriverRepositoryImp implements DriverPersistencePort {

    private final DriverRepository driverRepository;
    private final DriverMapper driverMapper;

    public DriverRepositoryImp(DriverRepository driverRepository, DriverMapper driverMapper) {
        this.driverRepository = driverRepository;
        this.driverMapper = driverMapper;
    }

    @Override
    public Driver saveDriver(Driver driver) {
        return null;
    }

    @Override
    public Driver updateDriver(Driver driver) {
        return null;
    }

    @Override
    public Optional<Driver> findDriverById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Driver> findAllDriver() {
        return null;
    }

    @Override
    public void deleteDriverById(int id) {

    }
}
