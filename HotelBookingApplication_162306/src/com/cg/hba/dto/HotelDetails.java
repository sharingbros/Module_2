package com.cg.hba.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hoteldetails")
public class HotelDetails {

	@Id
	private int id;
	private String name;
	private String rating;
	private int rate;
	private int availablerooms;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getAvailablerooms() {
		return availablerooms;
	}

	public void setAvailablerooms(int availablerooms) {
		this.availablerooms = availablerooms;
	}

	@Override
	public String toString() {
		return "HotelDetails [id=" + id + ", name=" + name + ", rating="
				+ rating + ", rate=" + rate + ", availablerooms="
				+ availablerooms + "]";
	}
	
	
}
