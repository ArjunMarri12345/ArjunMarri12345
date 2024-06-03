package com.example1.Dto;

import java.time.LocalTime;

import com.example1.FlightTracking.Entities.City;

public class FlightDto {
    
    private int durationInMinutes;
    private LocalTime DepartureTime;
    private LocalTime ArrivalTime;
    private String Aircraft;
    private String FromCity;
    private String ToCity;
    public int getDurationInMinutes() {
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
    public String getFromCity() {
        return FromCity;
    }
    public void setFromCity(String fromCity) {
        FromCity = fromCity;
    }
    public String getToCity() {
        return ToCity;
    }
    public void setToCity(String toCity) {
        ToCity = toCity;
    }
}