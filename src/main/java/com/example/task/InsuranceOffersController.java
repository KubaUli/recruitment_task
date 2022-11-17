package com.example.task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InsuranceOffersController {
    private final InsuranceOffersRepository insuranceOffersRepository;
    private final VehicleRepository vehicleRepository;
    private final InsuranceOffersService insuranceOffersService;

    public InsuranceOffersController(InsuranceOffersRepository insuranceOffersRepository, VehicleRepository vehicleRepository, InsuranceOffersService insuranceOffersService) {
        this.insuranceOffersRepository = insuranceOffersRepository;
        this.vehicleRepository = vehicleRepository;
        this.insuranceOffersService = insuranceOffersService;
    }

    @GetMapping("/{id}/vehicle/{vehicleNumber}")
    ResponseEntity<List<InsuranceOffers>> getVehicleByClientLogin(@PathVariable Long id, @PathVariable Long vehicleNumber) {
        if (insuranceOffersService.getAllVehiclefromUser(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(insuranceOffersService.findAllOfferts(id, vehicleNumber));

    }
}
