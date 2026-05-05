package com.cesde.cityscooterapp.domain;

import java.time.LocalDate;

public class Booking {

    public Integer idBooking;
    public LocalDate date;
    public Scooter scooter;
    public Driver driver;
    public PickUpPoint origen;
    public String arrive;
    public int stimatedTime;
    public double stimatedPrice;
    public double bookingStatus


    public Booking(Integer idBooking, LocalDate date, Scooter scooter, Driver driver, PickUpPoint origen, String arrive, int stimatedTime, double stimatedPrice, double bookingStatus) {
        this.idBooking = idBooking;
        this.date = date;
        this.scooter = scooter;
        this.driver = driver;
        this.origen = origen;
        this.arrive = arrive;
        this.stimatedTime = stimatedTime;
        this.stimatedPrice = stimatedPrice;
        this.bookingStatus = bookingStatus;
    }

    public Booking() {
    }


    public Integer getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Integer idBooking) {
        this.idBooking = idBooking;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Scooter getScooter() {
        return scooter;
    }

    public void setScooter(Scooter scooter) {
        this.scooter = scooter;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public PickUpPoint getOrigen() {
        return origen;
    }

    public void setOrigen(PickUpPoint origen) {
        this.origen = origen;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public int getStimatedTime() {
        return stimatedTime;
    }

    public void setStimatedTime(int stimatedTime) {
        this.stimatedTime = stimatedTime;
    }

    public double getStimatedPrice() {
        return stimatedPrice;
    }

    public void setStimatedPrice(double stimatedPrice) {
        this.stimatedPrice = stimatedPrice;
    }

    public double getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(double bookingStatus) {
        this.bookingStatus = bookingStatus;
    }



}
