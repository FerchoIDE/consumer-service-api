package com.posadas.consumer.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "destinations")
public class destinations {

	destination destination;

	public destination getDestination() {
		return destination;
	}

	public void setDestination(destination destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "destinations [destination=" + destination + "]";
	}
	
}
