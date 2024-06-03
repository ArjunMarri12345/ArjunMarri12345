package com.example1.FlightTracking.REpos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.FlightTracking.Entities.City;



public interface Cityrepo extends JpaRepository<City,String>{
    City getByCityCode(String cityCode);
}
