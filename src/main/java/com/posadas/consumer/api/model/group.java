package com.posadas.consumer.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "group")
public class group {
	   int guid;
       String name;
       String title;
       String language;
       String keyword;
       String shortDescription;
       String description;
       int order;
       String channel;
       boolean available;
       medialinks medialinks;
	public int getGuid() {
		return guid;
	}
	public void setGuid(int guid) {
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
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
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
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public medialinks getMedialinks() {
		return medialinks;
	}
	public void setMedialinks(medialinks medialinks) {
		this.medialinks = medialinks;
	}
	@Override
	public String toString() {
		return "group [guid=" + guid + ", name=" + name + ", title=" + title + ", language=" + language + ", keyword="
				+ keyword + ", shortDescription=" + shortDescription + ", description=" + description + ", order="
				+ order + ", channel=" + channel + ", available=" + available + ", medialinks=" + medialinks + "]";
	}
       
       
       
}
