package com.example.task;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClientRepository extends CrudRepository <Client, Long>{


    Client findAllById(Long id);

}
