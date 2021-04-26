package com.posadas.consumer.api.model.base;

import com.posadas.consumer.api.model.medialinks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "content ")
public class ContentFacility {
	
	@XmlElement(name = "guid")
	public String guid;
	
	@XmlElement(name = "name")
	public String name;
	
	@XmlElement(name = "title")
	public String title;
	
	@XmlElement(name = "keyword")
	public String keyword;
	
	@XmlElement(name = "language")
	public String language;
	
	@XmlElement(name = "description")
	public String description;
	
	@XmlElement(name = "medialinks")
	public medialinks medialinks;
	
	
	@XmlElement(name = "typeFoodRestaurant")
	public String typeFoodRestaurant;
	
	@XmlElement(name = "schedule")
    public String schedule;
	
	@XmlElement(name = "dresscodeRestaurant")
    public String dresscodeRestaurant;
	
	@XmlElement(name = "capacityRestaurant")
    public String capacityRestaurant;
	
	@XmlElement(name = "allInclusiveRestaurant")
    public String allInclusiveRestaurant;
	
	@XmlElement(name = "type")
    public String type;
	
	@XmlElement(name = "order")
    public int order;
	
	@XmlElement(name = "channel")
    public String channel;
	
	@XmlElement(name = "description_BEP")
    public String description_BEP;
       



	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public medialinks getMedialinks() {
		return medialinks;
	}

	public void setMedialinks(medialinks medialinks) {
		this.medialinks = medialinks;
	}

	public String getTypeFoodRestaurant() {
		return typeFoodRestaurant;
	}

	public void setTypeFoodRestaurant(String typeFoodRestaurant) {
		this.typeFoodRestaurant = typeFoodRestaurant;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getDresscodeRestaurant() {
		return dresscodeRestaurant;
	}

	public void setDresscodeRestaurant(String dresscodeRestaurant) {
		this.dresscodeRestaurant = dresscodeRestaurant;
	}

	public String getCapacityRestaurant() {
		return capacityRestaurant;
	}

	public void setCapacityRestaurant(String capacityRestaurant) {
		this.capacityRestaurant = capacityRestaurant;
	}

	public String getAllInclusiveRestaurant() {
		return allInclusiveRestaurant;
	}

	public void setAllInclusiveRestaurant(String allInclusiveRestaurant) {
		this.allInclusiveRestaurant = allInclusiveRestaurant;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription_BEP() {
		return description_BEP;
	}

	public void setDescription_BEP(String description_BEP) {
		this.description_BEP = description_BEP;
	}

	@Override
	public String toString() {
		return "ContentFacility [guid=" + guid + ", name=" + name + ", title=" + title + ", keyword=" + keyword
				+ ", language=" + language + ", description=" + description + ", medialinks=" + medialinks
				+ ", typeFoodRestaurant=" + typeFoodRestaurant + ", schedule=" + schedule + ", dresscodeRestaurant="
				+ dresscodeRestaurant + ", capacityRestaurant=" + capacityRestaurant + ", allInclusiveRestaurant="
				+ allInclusiveRestaurant + ", type=" + type + ", order=" + order + ", channel=" + channel
				+ ", description_BEP=" + description_BEP + "]";
	}

	



	
	
}
