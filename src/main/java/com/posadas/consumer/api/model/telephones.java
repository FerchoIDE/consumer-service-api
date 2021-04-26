package com.posadas.consumer.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "telephones")
public class telephones {
	telephone telephone;

	public telephone getTelephone() {
		return telephone;
	}

	public void setTelephone(telephone telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "telephones [telephone=" + telephone + "]";
	}
	
}
