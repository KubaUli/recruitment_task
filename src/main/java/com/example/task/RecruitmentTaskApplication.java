package com.example.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RecruitmentTaskApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(RecruitmentTaskApplication.class, args);

        ClientRepository userRepository = context.getBean(ClientRepository.class);
        VehicleRepository vehicleRepository = context.getBean(VehicleRepository.class);
        InsuranceOffersRepository insuranceOffersRepository = context.getBean(InsuranceOffersRepository.class);
        Client user1 = new Client("Kuba12","Kuba12","SilneHasło" )   ;
        userRepository.save(user1);
        Vehicle vehicle1 = new Vehicle(user1.getLogin(), " focus","focus","rok produkcji 2012");
        vehicleRepository.save(vehicle1);
        InsuranceOffers insuranceOffers1 = new InsuranceOffers(vehicle1.getId(), "PZU",1299,"OC+AC");
        insuranceOffersRepository.save(insuranceOffers1);
        Client user2 = new Client("Jan123","JanKowalski","12345678" )   ;
        userRepository.save(user2);
        Vehicle vehicle2 = new Vehicle(user2.getLogin(), " Mercedes","Sprinter","rok produkcji 2015");
        vehicleRepository.save(vehicle2);
        Vehicle vehicle3 = new Vehicle(user2.getLogin(), " Mazda","MX3","rok produkcji 2020");
        vehicleRepository.save(vehicle3);
        InsuranceOffers insuranceOffers2 = new InsuranceOffers(vehicle2.getId(), "PZU",599,"OC");
        insuranceOffersRepository.save(insuranceOffers2);
        InsuranceOffers insuranceOffers3 = new InsuranceOffers(vehicle2.getId(), "AXA",1599,"OC+AC");
        insuranceOffersRepository.save(insuranceOffers3);
        InsuranceOffers insuranceOffers4 = new InsuranceOffers(vehicle3.getId(), "PZU",599,"OC");
        insuranceOffersRepository.save(insuranceOffers2);
        InsuranceOffers insuranceOffers5 = new InsuranceOffers(vehicle3.getId(), "AXA",1599,"OC+AC");
        insuranceOffersRepository.save(insuranceOffers3);
      }
}
