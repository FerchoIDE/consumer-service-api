package com.posadas.consumer.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "physical")
public class physical {

	
	 int rooms;
     int floors;
     int elevators;
     int pools;
     int restaurants;
     int hottubes;
     int bars;
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public int getElevators() {
		return elevators;
	}
	public void setElevators(int elevators) {
		this.elevators = elevators;
	}
	public int getPools() {
		return pools;
	}
	public void setPools(int pools) {
		this.pools = pools;
	}
	public int getRestaurants() {
		return restaurants;
	}
	public void setRestaurants(int restaurants) {
		this.restaurants = restaurants;
	}
	public int getHottubes() {
		return hottubes;
	}
	public void setHottubes(int hottubes) {
		this.hottubes = hottubes;
	}
	public int getBars() {
		return bars;
	}
	public void setBars(int bars) {
		this.bars = bars;
	}
	@Override
	public String toString() {
		return "physical [rooms=" + rooms + ", floors=" + floors + ", elevators=" + elevators + ", pools=" + pools
				+ ", restaurants=" + restaurants + ", hottubes=" + hottubes + ", bars=" + bars + "]";
	}
     
     
     
}
