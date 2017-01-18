package com.subin.springboootmongo.entity;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="survey")
public class Survey {
	
	@Id
	private String id;
	private String name;
	private String description;
	private Set<Section> section;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Section> getSection() {
		return section;
	}
	public void setSection(Set<Section> section) {
		this.section = section;
	}

}
