package com.example.task;


import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class ClientController {
    private final ClientRepository clientRepository;





    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;

    }

    @GetMapping("/{id}")
    Optional<Client> getProductById(@PathVariable Long id) {
        Optional<Client> Clients = clientRepository.findById(id);

                System.out.println(Clients);
                return Clients;
    }



}




