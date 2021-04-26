package com.posadas.consumer.api.model.base;

import com.posadas.consumer.api.model.groups;
import com.posadas.consumer.api.model.medialinks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "room")
public class roomP {


	
	@XmlElement(name = "code")
    public String code;
	
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
	
	@XmlElement(name = "shortDescription")
	public String shortDescription;
	
	@XmlElement(name = "description")
	public String description;
	
	@XmlElement(name = "order")
	public String order;
	
	@XmlElement(name = "channel")
	public String channel;
	
	@XmlElement(name = "medialinks")
	public medialinks medialinks;
	
	@XmlElement(name = "groups")
	public groups groups;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String  getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
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

	public groups getGroups() {
		return groups;
	}

	public void setGroups(groups groups) {
		this.groups = groups;
	}

	@Override
	public String toString() {
		return "ContentRoom [code=" + code + ", guid=" + guid + ", name=" + name + ", title=" + title + ", keyword="
				+ keyword + ", language=" + language + ", shortDescription=" + shortDescription + ", description="
				+ description + ", order=" + order + ", channel=" + channel + ", medialinks=" + medialinks + ", groups="
				+ groups + "]";
	}
	
	
	
}
