package com.example.task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {
    private final VehicleRepository vehicleRepository;
    private final ClientRepository clientRepository;
    private final InsuranceOffersRepository insuranceOffersRepository;
    private final VehicleService vehicleService;

    public VehicleController(VehicleRepository vehicleRepository, ClientRepository clientRepository, InsuranceOffersRepository insuranceOffersRepository, VehicleService vehicleService) {
        this.vehicleRepository = vehicleRepository;
        this.clientRepository = clientRepository;
        this.insuranceOffersRepository = insuranceOffersRepository;
        this.vehicleService = vehicleService;
    }


    @GetMapping("/{id}/vehicle")
    ResponseEntity<List<Vehicle>> getVehicleByClientLogin(@PathVariable Long id) {
        if (vehicleService.findUserLogin(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        System.out.println(ResponseEntity.ok(vehicleService.getAllVehiclefromUser(id)));
        return ResponseEntity.ok(vehicleService.getAllVehiclefromUser(id));
    }

}
