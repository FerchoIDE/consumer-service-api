package com.posadas.consumer.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "roomtypes")
public class roomtypes {

	List<roomtype>  roomtype;

	public List<roomtype> getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(List<roomtype> roomtype) {
		this.roomtype = roomtype;
	}

	@Override
	public String toString() {
		return "roomtypes [roomtype=" + roomtype + "]";
	}
	
	
}
