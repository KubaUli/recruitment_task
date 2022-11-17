package com.example.task;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    private final ClientRepository clientRepository;
    private final VehicleRepository vehicleRepository;

    public VehicleService(ClientRepository clientRepository, VehicleRepository vehicleRepository) {
        this.clientRepository = clientRepository;
        this.vehicleRepository = vehicleRepository;
    }

   String findUserLogin(long id) {
        return (clientRepository.findById(id).get().login);
    }

    List<Vehicle> getAllVehiclefromUser(long id) {
        return vehicleRepository.findAllVehicleByUsersLogin(findUserLogin(id));
    }
}