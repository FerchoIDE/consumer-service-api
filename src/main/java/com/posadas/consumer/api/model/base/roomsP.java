package com.posadas.consumer.api.model.base;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "rooms")
public class roomsP {

	List<roomP> room;

	public List<roomP> getRoom() {
		return room;
	}

	public void setRoom(List<roomP> room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "roomsP [room=" + room + "]";
	}
	
	
	
}
