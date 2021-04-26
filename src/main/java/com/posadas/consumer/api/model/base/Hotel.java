package com.posadas.consumer.api.model.base;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "contents")
public class Hotel {

	
	
	public  Hotel() {
		
	}
    @XmlElement(name = "content")
   public List<ContentHotel> ContentHotel;

	@Override
	public String toString() {
		return "Hotel [contents=" + ContentHotel + "]";
	}

	public  List<ContentHotel> getContent() {
		return ContentHotel;
	}

	public void setContent( List<ContentHotel> ContentHotels) {
		this.ContentHotel = ContentHotels;
	}
    
    
}
