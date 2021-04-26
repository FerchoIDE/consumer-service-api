package com.posadas.consumer.api.model.base;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "brand")
public class brand {

         int guid;
         String code;
         String name;
         String title;
         String language;
         String keyword;
         int order;
         String channel;
         rates rates;
         @XmlElement(name= "hotel")
         List<hotelRate> hotel;
		public int getGuid() {
			return guid;
		}
		public void setGuid(int guid) {
			this.guid = guid;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String getKeyword() {
			return keyword;
		}
		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}
		public int getOrder() {
			return order;
		}
		public void setOrder(int order) {
			this.order = order;
		}
		public String getChannel() {
			return channel;
		}
		public void setChannel(String channel) {
			this.channel = channel;
		}
		public rates getRates() {
			return rates;
		}
		public void setRates(rates rates) {
			this.rates = rates;
		}
		public List<hotelRate> getHotel() {
			return hotel;
		}
		public void setHotel(List<hotelRate> hotel) {
			this.hotel = hotel;
		}
		@Override
		public String toString() {
			return "brand [guid=" + guid + ", code=" + code + ", name=" + name + ", title=" + title + ", language="
					+ language + ", keyword=" + keyword + ", order=" + order + ", channel=" + channel + ", rates="
					+ rates + ", hotel=" + hotel + "]";
		}
             
}
