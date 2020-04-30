package org.example.service;

import org.example.DAO.VehicleDAO;
import org.example.model.VehicleEntity;

import java.time.LocalDate;
import java.util.List;

public class VehicleService {

    VehicleDAO DAO = new VehicleDAO();

    public List<VehicleEntity> getVehicles() {
        return DAO.getVehicles();
    }

    public void addVehicle(VehicleEntity vehicle) {
        vehicle.setCreationDate(LocalDate.now());
        DAO.addVehicle(vehicle);
    }

    public void updateVehicle(VehicleEntity vehicle, int id) {
        vehicle.setId(id);
        DAO.updateVehicle(vehicle);
    }

    public void deleteVehicle(int id) {
        DAO.deleteVehicle(id);
    }

    public VehicleEntity getVehicle(int id) {
        return DAO.getVehicle(id);
    }
}
