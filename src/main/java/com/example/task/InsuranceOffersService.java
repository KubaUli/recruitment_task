package com.example.task;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class InsuranceOffersService {
    private final InsuranceOffersRepository insuranceOffersRepository;
    private final VehicleRepository vehicleRepository;
    private final VehicleService vehicleService;
    private final ClientRepository clientRepository;

    public InsuranceOffersService(InsuranceOffersRepository insuranceOffersRepository, VehicleRepository vehicleRepository, VehicleService vehicleService, ClientRepository clientRepository) {
        this.insuranceOffersRepository = insuranceOffersRepository;
        this.vehicleRepository = vehicleRepository;
        this.vehicleService = vehicleService;
        this.clientRepository = clientRepository;
    }
/*

    String findUserLogin(long id) {
        return (clientRepository.findById(id).get().login);
    }

    List<Vehicle> getAllVehiclefromUser(long id) {
        return vehicleRepository.findAllVehicleByUsersLogin(findUserLogin(id));
    }
*/


    List<InsuranceOffers> findAllOfferts(long id, long vehicleNumber) {

        return insuranceOffersRepository.findAllByVehicleId(vehicleNumber);
    }
}


