package com.cesde.cityscooterapp.infrastructure.out.mapper;


import com.cesde.cityscooterapp.domain.Driver;
import com.cesde.cityscooterapp.infrastructure.out.entities.DriverEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "phone", target = "phone")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "typeDriver", target = "typeDriver")
    @Mapping(source = "points", target = "points")
    @Mapping(source = "isPenalized", target = "isPenalized")
   Driver toDomain(DriverEntity driverEntity);

    @InheritInverseConfiguration
   DriverEntity toEntity(Driver driver);


    List<Driver> toDomainList(List<DriverEntity> driverEntities);

}
