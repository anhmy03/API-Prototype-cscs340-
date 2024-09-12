package com.csc340.demo;

import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
@RestController
public class RestAPIController {
    Map<String, Car> Cars = new HashMap<>();

    @GetMapping("car/all")
    public Object getAllCars(){
        if (Cars.isEmpty()) {
            Cars.put("toyota", new Car("sedan", "camry", "toyota"));

        }
        return Cars.values();
    }
    @GetMapping("car/{brand}")
    public Car getCarByBrand(@PathVariable String brand) {

        return Cars.get(brand);

    }
}
