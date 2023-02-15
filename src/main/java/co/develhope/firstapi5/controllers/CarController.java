package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CarController {

    @GetMapping("/cars")
    public CarDTO carNew(){
        return new CarDTO();
    }

    @PostMapping("/cars")
    public HttpStatus printCar(@RequestBody CarDTO carDTO){
        System.out.println(carDTO.toString());
        return HttpStatus.CREATED;

    }
}