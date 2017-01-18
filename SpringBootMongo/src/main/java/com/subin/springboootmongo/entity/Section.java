package com.subin.springboootmongo.entity;

import java.util.Set;

import org.springframework.data.annotation.Id;

public class Section {
	
	@Id
	private String id;
	private String secName;
	private String secDescription;
	private Set<Question> question;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSecName() {
		return secName;
	}
	public void setSecName(String secName) {
		this.secName = secName;
	}
	public String getSecDescription() {
		return secDescription;
	}
	public void setSecDescription(String secDescription) {
		this.secDescription = secDescription;
	}
	public Set<Question> getQuestion() {
		return question;
	}
	public void setQuestion(Set<Question> question) {
		this.question = question;
	}

}
