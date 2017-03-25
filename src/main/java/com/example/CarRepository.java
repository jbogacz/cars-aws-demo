package com.example;


import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by jbogacz on 10.03.2017.
 */
public interface CarRepository extends MongoRepository<Car, String> {
}
