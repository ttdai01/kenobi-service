package com.example.demo.organizations.dto;

public class OrganizationCreateDto {

	private String name;

	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String descriptionS) {
		this.description = descriptionS;
	}

	public OrganizationCreateDto(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
}
