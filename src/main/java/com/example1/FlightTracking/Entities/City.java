package com.example1.FlightTracking.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class City {
   // Code, Name, Minutes From UTC, Country
   @Id
   @Column(name="city_Code")
   private String cityCode;
   @Column(name="name")
   private String Name;
   @Column(name="minutes_From_Utc")
   private String minutesFromUtc;
   @Column(name="country")
   private String Country;
   @OneToMany(mappedBy ="FromCity")
   private List<Flight> flightComing;
   @OneToMany(mappedBy = "ToCity")
   private List<Flight> flightGoing;

   public City(String cityCode, String name, String minutesFromUtc, String country) {
      this.cityCode = cityCode;
      Name = name;
      this.minutesFromUtc = minutesFromUtc;
      Country = country;
   }
public City()
{

}
   public String getCityCode() {
      return cityCode;
   }

   public void setCityCode(String cityCode) {
      this.cityCode = cityCode;
   }

   public String getName() {
      return Name;
   }

   public void setName(String name) {
      Name = name;
   }

   public String getMinutesFromUtc() {
      return minutesFromUtc;
   }

   public void setMinutesFromUtc(String minutesFromUtc) {
      this.minutesFromUtc = minutesFromUtc;
   }

   public String getCountry() {
      return Country;
   }

   public void setCountry(String country) {
      Country = country;
   }

}
   