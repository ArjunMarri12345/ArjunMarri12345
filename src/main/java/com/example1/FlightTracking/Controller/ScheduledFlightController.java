package com.example1.FlightTracking.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example1.Dto.ScheduleFlghtDto;
import com.example1.FlightTracking.Entities.City;
import com.example1.FlightTracking.Entities.Flight;
import com.example1.FlightTracking.Entities.ScheduledFlight;
import com.example1.FlightTracking.REpos.Cityrepo;
import com.example1.FlightTracking.REpos.Flightrepo;
import com.example1.FlightTracking.REpos.ScheduledFlightRepo;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/scheduledflights")
public class ScheduledFlightController {
    @Autowired
    private ScheduledFlightRepo scheduledFlightRepo;
    @Autowired
    private Cityrepo cityrepo;
    @Autowired
    private Flightrepo flightrepo;
    @PostMapping("/addtoscheduleflights")
    public void addtoScheduleFlights(@RequestBody ScheduledFlight scheduledFlight
                                    ,@RequestParam String fromCity,@RequestParam String toCity,
                                    @RequestParam Integer flightno)
    {
     ScheduledFlight s=new ScheduledFlight();
      s.setDepartureDate(scheduledFlight.getDepartureDate());
      s.setDepartureTime(scheduledFlight.getDepartureTime());
      s.setArrivalDate(scheduledFlight.getArrivalDate());
      s.setArrivalTime(scheduledFlight.getArrivalTime());
      s.setDurationInMinutes(scheduledFlight.getDurationInMinutes());
      City fromCity2=cityrepo.getByCityCode(fromCity);
      s.setFromCity(fromCity2);
      City toCity2=cityrepo.getByCityCode(toCity);
      s.setToCity(toCity2);
      Flight flight= flightrepo.findById(flightno).orElse(null);
      s.setFlightNo(flight);
      scheduledFlightRepo.save(s);
    }
    @GetMapping("/scheduleflights")
    public List<ScheduleFlghtDto> getAllScheduledFlight()
    {
        List<ScheduledFlight> scheduledFlight2=scheduledFlightRepo.findAll();
        List<ScheduleFlghtDto> l=new ArrayList<>();
        for (ScheduledFlight s : scheduledFlight2) {
            ScheduleFlghtDto scheduleFlghtDto=new ScheduleFlghtDto();
            scheduleFlghtDto.setDeparturDate(s.getDepartureDate());
            scheduleFlghtDto.setDepartureTime(s.getDepartureTime());
            scheduleFlghtDto.setArrivalDate(s.getArrivalDate());
            scheduleFlghtDto.setArrivalTime(s.getArrivalTime());
            scheduleFlghtDto.setDurationInMinutes(s.getDurationInMinutes());
            scheduleFlghtDto.setFromCity(s.getFromCity().getCityCode());
            scheduleFlghtDto.setToCity(s.getToCity().getCityCode());
            l.add((scheduleFlghtDto));

        }
        return l;
    }
}
