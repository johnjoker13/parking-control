package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.api.parkingcontrol.models.CarModel;

public class ParkingSpotDto {
    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartment;
    @NotBlank
    private String block;
    @NotNull
    private CarModel car;
    
    public CarModel getCar() {
        return car;
    }
    public void setCar(CarModel car) {
        this.car = car;
    }
    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }
    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getResponsibleName() {
        return responsibleName;
    }
    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }
    public String getApartment() {
        return apartment;
    }
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
    public String getBlock() {
        return block;
    }
    public void setBlock(String block) {
        this.block = block;
    }
    
    
}
