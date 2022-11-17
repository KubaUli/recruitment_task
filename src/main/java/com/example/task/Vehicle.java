package com.example.task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    long Id;

    @NotNull
    String usersLogin;
    @NotNull
    String brand;
    @NotNull
    String model;
    String otherInformation;
    @NotNull
    LocalDateTime insertTime;
   /* @ManyToOne*//*(optional = false)*//*
    @JoinColumn(name = "User_id")
*//*    @JsonIgnore*//*
    private Client client;*/


    public Vehicle(String usersLogin, String brand, String model, String otherInformation) {
        this.usersLogin = usersLogin;
        this.brand = brand;
        this.model = model;
        this.otherInformation = otherInformation;
        this.insertTime = LocalDateTime.now();
    }

    public Vehicle() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsersLogin() {
        return usersLogin;
    }

    public void setUsersLogin(String usersLogin) {
        this.usersLogin = usersLogin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "pojazd{" +  "Id=" + Id +", usersLogin='" + usersLogin +  ", brand='" + brand +
                ", model='" + model +  ", otherInformation='" + otherInformation + ", insertTime=" + insertTime + '}';
    }
}

