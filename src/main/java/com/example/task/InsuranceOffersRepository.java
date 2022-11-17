package com.example.task;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface InsuranceOffersRepository extends CrudRepository<InsuranceOffers, Long> {

    List<InsuranceOffers> findAllByVehicleId(Long vehicleId);
    }

