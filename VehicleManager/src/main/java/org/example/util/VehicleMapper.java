package org.example.util;

import org.example.model.VehicleEntity;

import java.util.function.Function;

public interface VehicleMapper {

    Function<VehicleDTO, VehicleEntity> MAP_TO_VEHICLE = vehicleDTO -> {

        VehicleEntity vehicle = new VehicleEntity();

        vehicle.setModel(vehicleDTO.getModel());
        vehicle.setVehicleType(vehicleDTO.getVehicleType());
        vehicle.setPlateCountrey(vehicleDTO.getPlateCountrey());
        vehicle.setPlateNumber(vehicleDTO.getPlateNumber());
        vehicle.setVin(vehicleDTO.getVin());
        vehicle.setCreationDate(vehicleDTO.getCreationDate());
        vehicle.setManifacturedCountry(vehicleDTO.getManifacturedCountry());

        return vehicle;
    };
}
