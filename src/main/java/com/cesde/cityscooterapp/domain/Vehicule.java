package com.cesde.cityscooterapp.domain;

public class Vehicule {


    private Integer idVehicule;
    private String brand;
    private String state;
    private String serial;
    private int capacity;

    public Vehicule(Integer idVehicule, String brand, String state, String serial, int capacity) {
        this.idVehicule = idVehicule;
        this.brand = brand;
        this.state = state;
        this.serial = serial;
        this.capacity = capacity;
    }

    public Vehicule() {
    }


    public Integer getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(Integer idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
