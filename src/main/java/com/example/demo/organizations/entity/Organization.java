package com.example.demo.organizations.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.audittrails.entity.Log;
import com.example.demo.audittrails.services.LogServices;

@Entity
@Table(name = "organization")
public class Organization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "name", length = 128, nullable = false)
	private String name;

	@Column(name = "description", nullable = false)
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public void setDescription(String descriptionS) {
		this.description = descriptionS;
	}

	public Organization(Long id, String name, String descriptionS) {
		super();
		this.id = id;
		this.name = name;
		this.description = descriptionS;
	}

	@PrePersist
	@PreUpdate
	void trim() {
		this.description = this.description.trim();
	}

	public Organization() {
		super();
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}
