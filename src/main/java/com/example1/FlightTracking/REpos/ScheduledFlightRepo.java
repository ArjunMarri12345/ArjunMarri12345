package com.example1.FlightTracking.REpos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.FlightTracking.Entities.ScheduledFlight;

public interface ScheduledFlightRepo  extends JpaRepository<ScheduledFlight,Long>{
    
}
