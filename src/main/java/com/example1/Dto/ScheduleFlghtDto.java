package com.example1.Dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.example1.FlightTracking.Entities.City;

public class ScheduleFlghtDto {
    // Departure Date, Departure Time, Arrival Date,
// Arrival Time, From City, To City, Duration in Minutes
private LocalDate departurDate;
private LocalTime departureTime;
private LocalDate arrivalDate;
private LocalTime arrivalTime;
private String durationInMinutes;
private String fromCity;
private String toCity;
public LocalDate getDeparturDate() {
    return departurDate;
}
public void setDeparturDate(LocalDate departurDate) {
    this.departurDate = departurDate;
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
public String getFromCity() {
    return fromCity;
}
public void setFromCity(String fromCity) {
    this.fromCity = fromCity;
}
public String getToCity() {
    return toCity;
}
public void setToCity(String toCity) {
    this.toCity = toCity;
}
}