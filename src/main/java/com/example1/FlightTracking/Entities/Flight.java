package com.example1.FlightTracking.Entities;

import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Flight {
    // Flight No, From City, To City, Duration in Minutes,
// Departure Time, Arrival Time, Aircraft
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="flight_no")
    private int flightNo;
   
    @Column(name="duration_In_Minutes")
    private int durationInMinutes;
    
    @Column(name="departure_Time")
    private LocalTime DepartureTime;
  
    @Column(name="arrival_Time")
    private LocalTime ArrivalTime;
    @Column(name="aircraft")
    private String Aircraft;
    @ManyToOne
    @JoinColumn(name="from_city")
    private City FromCity;
    @ManyToOne
    @JoinColumn(name = "to_city")
    private City ToCity;
    @OneToMany(mappedBy = "flightNo")
    private List<ScheduledFlight> ScheduledFlights;
    public Flight(int durationInMinutes, LocalTime departureTime, LocalTime arrivalTime, String aircraft,
            City fromCity, City toCity) {
        this.durationInMinutes = durationInMinutes;
        DepartureTime = departureTime;
        ArrivalTime = arrivalTime;
        Aircraft = aircraft;
        FromCity = fromCity;
        ToCity = toCity;
    }
    
    public Flight() {
    }

    public int  getDurationInMinutes() {
        return durationInMinutes;
    }
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    public LocalTime getDepartureTime() {
        return DepartureTime;
    }
    public void setDepartureTime(LocalTime departureTime) {
        DepartureTime = departureTime;
    }
    public LocalTime getArrivalTime() {
        return ArrivalTime;
    }
    public void setArrivalTime(LocalTime arrivalTime) {
        ArrivalTime = arrivalTime;
    }
    public String getAircraft() {
        return Aircraft;
    }
    public void setAircraft(String aircraft) {
        Aircraft = aircraft;
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

    @Override
    public String toString() {
        return "Flight [flightNo=" + flightNo + ", durationInMinutes=" + durationInMinutes + ", DepartureTime="
                + DepartureTime + ", ArrivalTime=" + ArrivalTime + ", Aircraft=" + Aircraft + ", FromCity=" + FromCity
                + ", ToCity=" + ToCity + "]";
    }

}
