package mainclasses;

import java.util.ArrayList;
import java.util.List;
public class Apartment {	//عمارة 
	   String id;
	   String rent;	  
       String location; 	   
	   String water;
	   String electric;
	   String balcony;
	   String internet;
	   String bathrooms;
	   String bedrooms;
       //validation 	 
       String picture;
	   String date;
       String residence_name;
	   String residence_id;
	   	  
	   String floor; //الطابق
	   String number_of_apartments; //رقم الشقة
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWater() {
		return water;
	}
	public void setWater(String water) {
		this.water = water;
	}
	public String getElectric() {
		return electric;
	}
	public void setElectric(String electric) {
		this.electric = electric;
	}
	public String getBalcony() {
		return balcony;
	}
	public void setBalcony(String balcony) {
		this.balcony = balcony;
	}
	public String getInternet() {
		return internet;
	}
	public void setInternet(String internet) {
		this.internet = internet;
	}
	public String getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(String bathrooms) {
		this.bathrooms = bathrooms;
	}
	public String getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(String bedrooms) {
		this.bedrooms = bedrooms;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getResidence_name() {
		return residence_name;
	}
	public void setResidence_name(String residence_name) {
		this.residence_name = residence_name;
	}
	public String getResidence_id() {
		return residence_id;
	}
	public void setResidence_id(String residence_id) {
		this.residence_id = residence_id;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getNumber_of_apartments() {
		return number_of_apartments;
	}
	public void setNumber_of_apartments(String number_of_apartments) {
		this.number_of_apartments = number_of_apartments;
	}

	 public Apartment()
	 {
		 this.initialuser();
		
	 }

	 	
	public  void initialuser() {
		this.id="2";
		this.rent="1800$";
		this.id="1";
		this.location="Nablus-Rafidia";
		this.water="yes";
		this.electric="yes";
		this.internet="no";
		this.balcony="no";
		this.bathrooms="no";
		this.bedrooms="no";
		this.picture="no";
		this.date="no";
		this.residence_name="no";
		this.residence_id="no";
		this.floor="no";
		this.number_of_apartments="no";
		
			}

    
}
