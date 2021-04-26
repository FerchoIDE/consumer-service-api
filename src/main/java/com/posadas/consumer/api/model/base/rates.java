package com.posadas.consumer.api.model.base;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "rates")
public class rates {
	
	@XmlElement(name = "rate")
	List<rateP> rate;

	public List<rateP> getRate() {
		return rate;
	}

	public void setRate(List<rateP> rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "rates [rate=" + rate + "]";
	}
		
		
}
