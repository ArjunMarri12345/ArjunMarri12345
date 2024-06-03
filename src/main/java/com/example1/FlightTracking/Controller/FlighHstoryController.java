package com.example1.FlightTracking.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example1.FlightTracking.Entities.FlightHistory;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RequestMapping("/FlightHistory")
public class FlighHstoryController {
    @PostMapping("/add")
    public void addFlightHistory(@RequestBody FlightHistory flightHistory)
    {
  FlightHistory f=new FlightHistory();
  f.se
    }
    
}
