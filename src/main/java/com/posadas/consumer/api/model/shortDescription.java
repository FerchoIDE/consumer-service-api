package com.posadas.consumer.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "shortDescription")
public class shortDescription {
	String p;

	public String getDescription() {
		return p;
	}

	public void setDescription(String p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "shortDescription [description=" + p + "]";
	}
	
}
