package com.posadas.consumer.api.model.base;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "contents")
public class Room {

public  Room() {
		
	}
    @XmlElement(name = "content")
   public List<ContentRoom> content;

	@Override
	public String toString() {
		return "Hotel [contents=" + content + "]";
	}

	public  List<ContentRoom> getContent() {
		return content;
	}

	public void setContent( List<ContentRoom> contents) {
		this.content = contents;
	}
}
