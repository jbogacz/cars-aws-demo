package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jbogacz on 10.03.2017.
 */
@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping(path = "/cars", method = RequestMethod.GET)
    public List<Car> all() {
        return carRepository.findAll();
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void add(@RequestBody Car car) {
        carRepository.save(car);
    }

}
