package com.posadas.consumer.api.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "facilities")
public class facilities {

	public ArrayList<String> facility;

	public ArrayList<String> getFacility() {
		return facility;
	}

	public void setFacility(ArrayList<String> facility) {
		this.facility = facility;
	}

	@Override
	public String toString() {
		return "facilities [facility=" + facility + "]";
	}
	
	
}
