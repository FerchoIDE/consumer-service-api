package com.posadas.consumer.api.model.base;

import com.posadas.consumer.api.model.Logo;
import com.posadas.consumer.api.model.alternatehotels;
import com.posadas.consumer.api.model.amenities;
import com.posadas.consumer.api.model.avisos;
import com.posadas.consumer.api.model.description;
import com.posadas.consumer.api.model.destinations;
import com.posadas.consumer.api.model.facilities;
import com.posadas.consumer.api.model.location;
import com.posadas.consumer.api.model.medialinks;
import com.posadas.consumer.api.model.physical;
import com.posadas.consumer.api.model.roomtypes;
import com.posadas.consumer.api.model.shortDescription;
import com.posadas.consumer.api.model.telephones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "content")
public class ContentHotel {
	
	@XmlElement(name = "amenities")
	public amenities amenities;
	
	@XmlElement(name = "code")
    public String code;
	
	@XmlElement(name = "medialinks")
	public medialinks medialinks;
	
	@XmlElement(name = "destinations")
	public destinations destinations;
	
	@XmlElement(name = "channel")
	public String channel;
	
	@XmlElement(name = "telephones")
	public telephones telephones;
	
	@XmlElement(name = "description")
	public String description;
	
	@XmlElement(name = "language")
	public String language;
	
	@XmlElement(name = "shortDescription")
	public String shortDescription;
	
	@XmlElement(name = "title")
	public String title;
	
	@XmlElement(name = "brandcode")
	public String brandcode;
	
	@XmlElement(name = "Logo")
	public Logo Logo;
	
	@XmlElement(name = "avisos")
	public avisos avisos;
	
	@XmlElement(name = "roomtypes")
	public roomtypes roomtypes;
	
	@XmlElement(name = "name")
	public String name;
	
	@XmlElement(name = "guid")
	public String guid;
	
	@XmlElement(name = "location")
	public location location;
	
	@XmlElement(name = "keyword")
	public String keyword;
	
	@XmlElement(name = "alternatehotels")
	public alternatehotels  alternatehotels;
	
	@XmlElement(name = "facilities")
	public facilities facilities;
	
	@XmlElement(name = "physical")
	public physical physical;
	
	@XmlElement(name = "order")
	public String order;
	
	public ContentHotel() {
		
	}

	public amenities getAmenities() {
		return amenities;
	}

	public void setAmenities(amenities amenities) {
		this.amenities = amenities;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public medialinks getMedialinks() {
		return medialinks;
	}

	public void setMedialinks(medialinks medialinks) {
		this.medialinks = medialinks;
	}

	public destinations getDestinations() {
		return destinations;
	}

	public void setDestinations(destinations destinations) {
		this.destinations = destinations;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public telephones getTelephones() {
		return telephones;
	}

	public void setTelephones(telephones telephones) {
		this.telephones = telephones;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrandcode() {
		return brandcode;
	}

	public void setBrandcode(String brandcode) {
		this.brandcode = brandcode;
	}

	public Logo getLogo() {
		return Logo;
	}

	public void setLogo(Logo logo) {
		Logo = logo;
	}

	public avisos getAvisos() {
		return avisos;
	}

	public void setAvisos(avisos avisos) {
		this.avisos = avisos;
	}

	public roomtypes getRoomtypes() {
		return roomtypes;
	}

	public void setRoomtypes(roomtypes roomtypes) {
		this.roomtypes = roomtypes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public location getLocation() {
		return location;
	}

	public void setLocation(location location) {
		this.location = location;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public alternatehotels getAlternatehotels() {
		return alternatehotels;
	}

	public void setAlternatehotels(alternatehotels alternatehotels) {
		this.alternatehotels = alternatehotels;
	}

	public facilities getFacilities() {
		return facilities;
	}

	public void setFacilities(facilities facilities) {
		this.facilities = facilities;
	}

	public physical getPhysical() {
		return physical;
	}

	public void setPhysical(physical physical) {
		this.physical = physical;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "ContentHotel [amenities=" + amenities + ", code=" + code + ", medialinks=" + medialinks + ", destinations="
				+ destinations + ", channel=" + channel + ", telephones=" + telephones + ", description=" + description
				+ ", language=" + language + ", shortDescription=" + shortDescription + ", title=" + title
				+ ", brandcode=" + brandcode + ", Logo=" + Logo + ", avisos=" + avisos + ", roomtypes=" + roomtypes
				+ ", name=" + name + ", guid=" + guid + ", location=" + location + ", keyword=" + keyword
				+ ", alternatehotels=" + alternatehotels + ", facilities=" + facilities + ", physical=" + physical
				+ ", order=" + order + "]";
	}
	
	
	
	
	
}
