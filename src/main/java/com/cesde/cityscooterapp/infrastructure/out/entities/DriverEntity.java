package com.cesde.cityscooterapp.infrastructure.out.entities;


import com.cesde.cityscooterapp.domain.enums.IsPenalizedEnum;
import com.cesde.cityscooterapp.domain.enums.TypeDriverEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "drivers")
@AllArgsConstructor
@NoArgsConstructor
public class DriverEntity {

    @Id
    private Integer id;
    @Column(name = "user_name", length = 55, nullable = false)
    private String name;
    @Column(name = "last_name",length= 55,  nullable = false)
    private String lastName;
    private String phone;
    private String email;
    private String password;
    private boolean status;
    @Column(name = "type_driver", length = 55, nullable = false)
    private TypeDriverEnum typeDriver;
    private Integer points;
    private IsPenalizedEnum isPenalized;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
