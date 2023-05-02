package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="hello")
public class TravelModel 
{
	@Id 
   private int Travelnum;
   private String Travelname;
   private String Travelversion;
public int getTravelnum() {
	return Travelnum;
}
public void setTravelnum(int travelnum) {
	this.Travelnum = travelnum;
}
public String getTravelname() {
	return Travelname;
}
public void settravelname(String travelname) {
	this.Travelname = travelname;
}
public String getTravelversion() {
	return Travelversion;
}
public void setTravelversion(String Travelversion) {
	this.Travelversion = Travelversion;
}
   
}