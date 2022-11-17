package com.example.task;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class InsuranceOffers {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @NotNull
    Long vehicleId;
    @NotNull
    String insuser;
    @NotNull
    float price;
    String otherInformation;
    @NotNull
    LocalDateTime insertTime;
  /*  @ManyToOne(optional = false)
    @JoinColumn(name = "User_id")
    @JsonIgnore
    private Client client;*/



    public InsuranceOffers(long vehicleId, String insuser, float price, String otherInformation) {
        this.vehicleId = vehicleId;
        this.insuser = insuser;
        this.price = price;
        this.otherInformation = otherInformation;
        this.insertTime = LocalDateTime.now();
    }

    public InsuranceOffers() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getInsuser() {
        return insuser;
    }

    public void setInsuser(String insuser) {
        this.insuser = insuser;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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
        return "Oferty ubezpieczeniowe{" +  "id=" + id +  ", vehicleId=" + vehicleId +", insuser='" + insuser +
                ", price=" + price + ", inne inormacje='" + otherInformation +  ", insertTime=" + insertTime + '}';
    }
}
