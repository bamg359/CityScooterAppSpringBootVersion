package com.cesde.cityscooterapp.application.inpurport;

import com.cesde.cityscooterapp.domain.Driver;

import java.util.Optional;

public interface DriverUseCase {

    Driver createrDriver(Driver driver);
    Driver updateDriver(Driver driver);
    Optional<Driver> getDriverById(int id);

}
