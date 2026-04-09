package com.cesde.cityscooterapp.application;

import com.cesde.cityscooterapp.application.inputport.DriverUseCase;
import com.cesde.cityscooterapp.application.outputport.DriverPersistencePort;
import com.cesde.cityscooterapp.domain.Driver;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DriverUseCaseImp implements DriverUseCase {

    private final DriverPersistencePort driverPersistencePort;

    public DriverUseCaseImp(DriverPersistencePort driverPersistencePort) {
        this.driverPersistencePort = driverPersistencePort;
    }

    @Override
    public Driver createrDriver(Driver driver) {

        return driverPersistencePort.saveDriver(driver);
    }

    @Override
    public Driver updateDriver(Driver driver) {
        return null;
    }

    @Override
    public Optional<Driver> getDriverById(int id) {

        Driver driver = driverPersistencePort.findDriverById(id).stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);


        return Optional.ofNullable(driver);
    }
}
