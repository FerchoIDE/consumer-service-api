package com.posadas.consumer.api.model.base;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "content")
public class ContentRate {

	List<brand> brand;

	public List<brand> getBrand() {
		return brand;
	}

	public void setBrand(List<brand> brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "ContentRate [brand=" + brand + "]";
	}
	
	
}
