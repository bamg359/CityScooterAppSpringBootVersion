package com.cesde.cityscooterapp.domain;

public class PickUpPoint {

    private Integer idPickUpPoint;
    private String PointName;
    private PointCategory category;
    private String Address;
    private String Status;
    private Employee Admin;


    public PickUpPoint(Integer idPickUpPoint, String pointName, PointCategory category, String address, String status, Employee admin) {
        this.idPickUpPoint = idPickUpPoint;
        PointName = pointName;
        this.category = category;
        Address = address;
        Status = status;
        Admin = admin;
    }

    public PickUpPoint() {
    }

    public Integer getIdPickUpPoint() {
        return idPickUpPoint;
    }

    public void setIdPickUpPoint(Integer idPickUpPoint) {
        this.idPickUpPoint = idPickUpPoint;
    }

    public String getPointName() {
        return PointName;
    }

    public void setPointName(String pointName) {
        PointName = pointName;
    }

    public PointCategory getCategory() {
        return category;
    }

    public void setCategory(PointCategory category) {
        this.category = category;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Employee getAdmin() {
        return Admin;
    }

    public void setAdmin(Employee admin) {
        Admin = admin;
    }
}



