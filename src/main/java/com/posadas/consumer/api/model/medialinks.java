package com.posadas.consumer.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "medialinks")
public class medialinks {
	
	
	
	public medialinks() {
		
	}

	@XmlElements({
	    @XmlElement(name="medialink"),
	    @XmlElement(name="mediaLink")
	})
	public medialink medialink;

	public medialink getMedialink() {
		return medialink;
	}

	public void setMedialink(medialink medialink) {
		this.medialink = medialink;
	}

	@Override
	public String toString() {
		return "medialinks [medialink=" + medialink + "]";
	}
	
	
}
