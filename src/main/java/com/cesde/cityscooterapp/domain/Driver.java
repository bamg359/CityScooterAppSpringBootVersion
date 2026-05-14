package com.cesde.cityscooterapp.domain;

import com.cesde.cityscooterapp.domain.enums.IsPenalizedEnum;
import com.cesde.cityscooterapp.domain.enums.TypeDriverEnum;

public class Driver extends User{
     private TypeDriverEnum typeDriver;
     private  Integer points;
     private IsPenalizedEnum isPenalized;


    public Driver() {
         super();
    }

    public Driver(int id, String name, String lastName, String phone, String email, String password, boolean status, TypeDriverEnum typeDriver, Integer points, IsPenalizedEnum isPenalized) {
        super(id, name, lastName, phone, email, password, status);
        this.typeDriver = typeDriver;
        this.points = points;
        this.isPenalized = isPenalized;
    }

    public TypeDriverEnum getTypeDriver() {
          return typeDriver;
     }

     public void setTypeDriver(TypeDriverEnum typeDriver) {
          this.typeDriver = typeDriver;
     }

     public Integer getPoints() {
          return points;
     }

     public void setPoints(Integer points) {
          this.points = points;
     }

     public IsPenalizedEnum getIsPenalized() {
          return isPenalized;
     }

     public void setIsPenalized(IsPenalizedEnum isPenalized) {
          this.isPenalized = isPenalized;
     }
}
