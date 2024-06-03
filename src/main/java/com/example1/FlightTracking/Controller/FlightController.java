package com.example1.FlightTracking.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example1.Dto.FlightDto;
import com.example1.FlightTracking.Entities.Flight;
import com.example1.FlightTracking.REpos.Cityrepo;
import com.example1.FlightTracking.REpos.Flightrepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/flights")
@RestController
public class FlightController {
    @Autowired
    Flightrepo flightrepo;
    @Autowired
    Cityrepo cityrepo;
    @PostMapping("/add")
    public void addingFlight(@RequestBody Flight flight,@RequestParam("FromcityCode") String FromcityCode,@RequestParam("TocityCode") String Tocitycode) {
         Flight f=new Flight();
         f.setAircraft(flight.getAircraft());
         f.setArrivalTime(flight.getArrivalTime());
         f.setDepartureTime(flight.getDepartureTime());
         f.setDurationInMinutes(flight.getDurationInMinutes());
         f.setFromCity(cityrepo.getByCityCode(FromcityCode));
         f.setToCity(cityrepo.getByCityCode(Tocitycode));
          flightrepo.save(f);
    
    }
    @GetMapping("/getflights")
    public List<FlightDto> getFlight()
    {
    List<Flight> flights=flightrepo.findAll();
    List<FlightDto> flightDtos=new ArrayList<>();
    for(Flight f:flights)
    {
      FlightDto fd=new FlightDto();
      fd.setAircraft(f.getAircraft());
      fd.setDurationInMinutes(f.getDurationInMinutes());
      fd.setDepartureTime(f.getDepartureTime());
      fd.setArrivalTime(f.getArrivalTime());
      fd.setFromCity(f.getFromCity().getCityCode());
      fd.setToCity(f.getToCity().getCityCode());
      flightDtos.add(fd);
    }
    return flightDtos;
}
}
