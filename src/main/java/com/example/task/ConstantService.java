package com.example.task;

import org.springframework.stereotype.Service;


@Service
public class ConstantService {
    private final ClientRepository clientRepository;
    private final VehicleRepository vehicleRepository;

    private final InsuranceOffersRepository insuranceOffersRepository;

    public ConstantService(ClientRepository clientRepository, VehicleRepository vehicleRepository, InsuranceOffersRepository insuranceOffersRepository) {
        this.clientRepository = clientRepository;
        this.vehicleRepository = vehicleRepository;
        this.insuranceOffersRepository = insuranceOffersRepository;
    }
 


}

