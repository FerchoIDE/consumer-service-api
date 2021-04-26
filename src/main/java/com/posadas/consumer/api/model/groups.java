package com.posadas.consumer.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "groups")
public class groups {
	public group group;

	public group getGroup() {
		return group;
	}

	public void setGroup(group group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "groups [group=" + group + "]";
	}
	
}
