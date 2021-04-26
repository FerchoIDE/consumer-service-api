package com.posadas.consumer.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "description")
public class description {
	 List<String> p;

	public List<String> getDescription() {
		return p;
	}

	public void setDescription( List<String> p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "description [description=" + p + "]";
	}
	
}
