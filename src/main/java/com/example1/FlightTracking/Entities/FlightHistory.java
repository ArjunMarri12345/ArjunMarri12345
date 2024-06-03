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
public class FlightHistory {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="flight_History_Id")
    private long flightHistoryId;
//  Flight No, Departure Date, Departure Time, Arrival Date,
// Arrival Time, Duration in Minutes, From City, To City,
// Aircraft, Remarks
@Column(name="departure_Date")
private LocalDate departureDate;
@Column(name="departure_Time")
private LocalTime departureTime;
@Column(name="arrival_Date")
private LocalDate arrivalDate;
@Column(name="arrival_Time")
private LocalTime ariivalTime;
@Column(name="duration_In_Minutes")
private String durationInMinutes;
@ManyToOne
@JoinColumn(name="from_City_no")
private City fromCity;
@ManyToOne
@JoinColumn(name="to_City_no")
private City toCity;
@Column(name="air_Craft")
private String airCraft;
@Column(name="remarks")
private String remarks;

public FlightHistory(LocalDate departureDate, LocalTime departureTime, LocalDate arrivalDate, LocalTime ariivalTime,
        String durationInMinutes, City fromCity, City toCity, String airCraft, String remarks) {
    this.departureDate = departureDate;
    this.departureTime = departureTime;
    this.arrivalDate = arrivalDate;
    this.ariivalTime = ariivalTime;
    this.durationInMinutes = durationInMinutes;
    this.fromCity = fromCity;
    this.toCity = toCity;
    this.airCraft = airCraft;
    this.remarks = remarks;
}

public FlightHistory() {
}

public LocalDate getDepartureDate() {
    return departureDate;
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
public LocalTime getAriivalTime() {
    return ariivalTime;
}
public void setAriivalTime(LocalTime ariivalTime) {
    this.ariivalTime = ariivalTime;
}
public String getDurationInMinutes() {
    return durationInMinutes;
}
public void setDurationInMinutes(String durationInMinutes) {
    this.durationInMinutes = durationInMinutes;
}
public City getFromCity() {
    return fromCity;
}
public void setFromCity(City fromCity) {
    this.fromCity = fromCity;
}
public City getToCity() {
    return toCity;
}
public void setToCity(City toCity) {
    this.toCity = toCity;
}
public String getAirCraft() {
    return airCraft;
}
public void setAirCraft(String airCraft) {
    this.airCraft = airCraft;
}
public String getRemarks() {
    return remarks;
}
public void setRemarks(String remarks) {
    this.remarks = remarks;
}



}
