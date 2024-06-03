package com.example1.FlightTracking.REpos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.FlightTracking.Entities.Flight;

public interface Flightrepo extends JpaRepository< Flight,Integer>{
    
    
}
