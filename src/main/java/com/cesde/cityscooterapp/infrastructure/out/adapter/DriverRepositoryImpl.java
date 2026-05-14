package com.cesde.cityscooterapp.infrastructure.out.adapter;


import com.cesde.cityscooterapp.application.outputports.DriverPersistencePort;
import com.cesde.cityscooterapp.domain.Driver;
import com.cesde.cityscooterapp.infrastructure.out.entities.DriverEntity;
import com.cesde.cityscooterapp.infrastructure.out.mapper.DriverMapper;
import com.cesde.cityscooterapp.infrastructure.out.reposotiry.DriverJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DriverRepositoryImpl implements DriverPersistencePort {

    private final DriverJpaRepository driverJpaRepository;
    private final DriverMapper driverMapper;

    public DriverRepositoryImpl(DriverJpaRepository driverJpaRepository, DriverMapper driverMapper) {
        this.driverJpaRepository = driverJpaRepository;
        this.driverMapper = driverMapper;
    }


    @Override
    public Driver saveDriver(Driver driver) {

        DriverEntity driverEntity= driverMapper.toEntity(driver);

        return driverMapper.toDomain(driverJpaRepository.save(driverEntity));
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
    public List<Driver> findAllDrivers() {
        return List.of();
    }

    @Override
    public void deleteDriverById(int id) {

    }
}
