package com.cesde.cityscooterapp.domain;

import com.cesde.cityscooterapp.domain.enums.RolEnum;

public class Employee extends User{

    private RolEnum rol;


    public Employee() {
    }

    public Employee(int id, String name, String lastName, String phone, String email, String password, boolean status, RolEnum rol) {
        super(id, name, lastName, phone, email, password, status);
        this.rol = rol;
    }


    public Employee(RolEnum rol) {
        this.rol = rol;
    }



    public RolEnum getRol() {
        return rol;
    }

    public void setRol(RolEnum rol) {
        this.rol = rol;
    }






}
