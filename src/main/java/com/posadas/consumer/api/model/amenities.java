package com.posadas.consumer.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "amenities")
public class amenities {
	
	
	List<amenity> amenity;

	public List<amenity> getAmenity() {
		return amenity;
	}

	public void setAmenity(List<amenity> amenity) {
		this.amenity = amenity;
	}

	@Override
	public String toString() {
		return "amenities [amenity=" + amenity + "]";
	}
}
