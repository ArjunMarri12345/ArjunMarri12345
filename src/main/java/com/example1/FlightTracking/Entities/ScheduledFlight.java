package com.example1.FlightTracking.Entities;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class ScheduledFlight {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long ScheduledFlightId;
//     Flight No, Departure Date, Departure Time, Arrival Date,
// Arrival Time, From City, To City, Duration in Minutes
   @Column(name="departure_Date")
    private LocalDate departureDate;
    @Column(name="departure_Time")
    private LocalTime departureTime;
    @Column(name="arrival_Date")
    private LocalDate arrivalDate;
    @Column(name="arrival_Time")
    private LocalTime arrivalTime;
    @Column(name="duration_In_Minutes")
    private String durationInMinutes;
    @ManyToOne
    @JoinColumn(name = "from_City_code")
    private City FromCity;
    @ManyToOne
    @JoinColumn(name="to_city_code")
    private City ToCity;
    @ManyToOne
    @JoinColumn(name="flight_no")
    private Flight flightNo;
    public LocalDate getDepartureDate() {
        return departureDate;
    }
    
    public ScheduledFlight(LocalDate departureDate, LocalTime departureTime, LocalDate arrivalDate,
            LocalTime arrivalTime, String durationInMinutes, City fromCity, City toCity, Flight flightNo) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.durationInMinutes = durationInMinutes;
        FromCity = fromCity;
        ToCity = toCity;
        this.flightNo = flightNo;
    }
    

    public ScheduledFlight() {
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }
    public LocalTime getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
    public LocalDate getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    public LocalTime getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public String getDurationInMinutes() {
        return durationInMinutes;
    }
    public void setDurationInMinutes(String durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    public City getFromCity() {
        return FromCity;
    }
    public void setFromCity(City fromCity) {
        FromCity = fromCity;
    }
    public City getToCity() {
        return ToCity;
    }
    public void setToCity(City toCity) {
        ToCity = toCity;
    }
    public Flight getFlightNo() {
        return flightNo;
    }
    public void setFlightNo(Flight flightNo) {
        this.flightNo = flightNo;
    }

    
}
