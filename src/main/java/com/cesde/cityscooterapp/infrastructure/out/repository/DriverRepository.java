package com.cesde.cityscooterapp.infrastructure.out.repository;

import com.cesde.cityscooterapp.infrastructure.out.entities.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<DriverEntity, Integer> {


}
