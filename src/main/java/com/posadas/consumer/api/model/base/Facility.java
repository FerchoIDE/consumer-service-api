package com.posadas.consumer.api.model.base;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "contents")
public class Facility {

	
public  Facility() {
		
	}
    @XmlElement(name = "content")
   public List<ContentFacility> content;

	@Override
	public String toString() {
		return "Facility [contents=" + content + "]";
	}

	public  List<ContentFacility> getContent() {
		return content;
	}

	public void setContent( List<ContentFacility> contents) {
		this.content = contents;
	}
}
