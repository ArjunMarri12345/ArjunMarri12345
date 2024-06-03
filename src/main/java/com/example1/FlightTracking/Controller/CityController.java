package com.example1.FlightTracking.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example1.FlightTracking.Entities.City;
import com.example1.FlightTracking.REpos.Cityrepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RequestMapping("/city")
@RestController
public class CityController {
    @Autowired
    Cityrepo cityrepo;
    @PostMapping("/addcities")
    public void addCities(@RequestBody City city) {
        cityrepo.save(city);
        
    }
    @GetMapping("/getcity")
    public City getcity(@RequestParam("cityCode") String cityCode) {
        return cityrepo.getByCityCode(cityCode);
    }
    @GetMapping("/getallcities")
    public List<City> getallCities()
    {
       List<City> cities =cityrepo.findAll();
       return cities;
    }
    }
    
    
   

    

