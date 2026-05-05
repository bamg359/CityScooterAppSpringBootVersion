package com.cesde.cityscooterapp.domain;


public class Scooter extends Vehicule {

    private Integer idScooter;
    private int horsePower;
    private PickUpPoint pickUp;
    private String type;


    public Scooter(Integer idVehicule, String brand, String state, String serial, int capacity,
                   Integer idScooter, int horsePower, PickUpPoint pickUp, String type) {
        super(idVehicule, brand, state, serial, capacity);
        this.idScooter = idScooter;
        this.horsePower = horsePower;
        this.pickUp = pickUp;
        this.type = type;
    }

    public Scooter(Integer idScooter, int horsePower, PickUpPoint pickUp, String type) {
        this.idScooter = idScooter;
        this.horsePower = horsePower;
        this.pickUp = pickUp;
        this.type = type;
    }

    public Scooter() {
    }

    public Integer getIdScooter() {
        return idScooter;
    }

    public void setIdScooter(Integer idScooter) {
        this.idScooter = idScooter;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public PickUpPoint getPickUp() {
        return pickUp;
    }

    public void setPickUp(PickUpPoint pickUp) {
        this.pickUp = pickUp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}