package com.posadas.consumer.api.model.base;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "contents")
public class Rate {

	 @XmlElement(name = "content")
	   public List<ContentRate> ContentRate;

		@Override
		public String toString() {
			return "Rate [contents=" + ContentRate + "]";
		}

		public  List<ContentRate> getContent() {
			return ContentRate;
		}

		public void setContent( List<ContentRate> ContentRate) {
			this.ContentRate = ContentRate;
		}
}
