package com.posadas.consumer.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "medialink")
public class medialink {
	
	@XmlElement(name = "multimedia")
	List<multimedia> multimedia;
	
	String thumbnail;
	String keyword;
	
	@XmlAttribute(name = "type")
	String type;

	public List<multimedia> getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(List<multimedia> multimedia) {
		this.multimedia = multimedia;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "medialink [multimedia=" + multimedia + ", thumbnail=" + thumbnail + ", keyword=" + keyword + ", type="
				+ type + "]";
	}

	
}
