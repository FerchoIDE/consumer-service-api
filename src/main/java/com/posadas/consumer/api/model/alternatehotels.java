package com.posadas.consumer.api.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "alternatehotels")
public class alternatehotels {

	public ArrayList<String> hotelcode;

	public ArrayList<String> getHotelcode() {
		return hotelcode;
	}

	public void setHotelcode(ArrayList<String> hotelcode) {
		this.hotelcode = hotelcode;
	}

	@Override
	public String toString() {
		return "alternatehotels [hotelcode=" + hotelcode + "]";
	}
	
	

}
