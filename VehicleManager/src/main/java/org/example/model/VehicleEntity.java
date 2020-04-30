package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity(name="vehicle")
@Table(name="vehicle")
public class VehicleEntity {

    @Id
    @Column(name="id", unique = true)
    private int id;

    @Column(name="model")
    private String model;

    @Column(name="vehicle_type")
    private String vehicleType;

    @Column(name="plate_countrey")
    private String plateCountrey;

    @Column(name="plate_number")
    private String plateNumber;

    @Column(name="vin", unique = true)
    private String vin;

    @Column(name="creation_date")
    private LocalDate creationDate;

    @Column(name="manifactured_country")
    private String manifacturedCountry;

    public VehicleEntity() {
    }

    public VehicleEntity(int id, String model, String vehicleType, String plateCountrey, String plateNumber, String vin, LocalDate creationDate, String manifacturedCountry) {
        this.id = id;
        this.model = model;
        this.vehicleType = vehicleType;
        this.plateCountrey = plateCountrey;
        this.plateNumber = plateNumber;
        this.vin = vin;
        this.creationDate = creationDate;
        this.manifacturedCountry = manifacturedCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
