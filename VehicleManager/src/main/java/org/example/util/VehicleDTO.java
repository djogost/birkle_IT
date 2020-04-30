package org.example.util;

import java.time.LocalDate;

public class VehicleDTO {

    private String model;
    private String vehicleType;
    private String plateCountrey;
    private String plateNumber;
    private String vin;
    private LocalDate creationDate;
    private String manifacturedCountry;

    public VehicleDTO() {
    }

    public VehicleDTO(String model, String vehicleType, String plateCountrey, String plateNumber, String vin, LocalDate creationDate, String manifacturedCountry) {
        this.model = model;
        this.vehicleType = vehicleType;
        this.plateCountrey = plateCountrey;
        this.plateNumber = plateNumber;
        this.vin = vin;
        this.creationDate = creationDate;
        this.manifacturedCountry = manifacturedCountry;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getPlateCountrey() {
        return plateCountrey;
    }

    public void setPlateCountrey(String plateCountrey) {
        this.plateCountrey = plateCountrey;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getManifacturedCountry() {
        return manifacturedCountry;
    }

    public void setManifacturedCountry(String manifacturedCountry) {
        this.manifacturedCountry = manifacturedCountry;
    }
}
