package com.cesde.cityscooterapp.domain;

public class PointCategory {

    private Integer idCategory;
    private String descripcion;


    public PointCategory(Integer idCategory, String descripcion) {
        this.idCategory = idCategory;
        this.descripcion = descripcion;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
