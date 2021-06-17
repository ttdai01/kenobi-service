package com.example.demo.audittrails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "log")
public class Log {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "category", nullable = false)
	private String category;

	@Column(name = "orgId", nullable = true)
	private Long orgId;

	@Column(name = "teamId", nullable = true)
	private Long teamId;
	
	@Column(name = "memberId", nullable = true)
	private Long memberId;
	
	@Column(name = "action", nullable = false)
	private String action;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Log(String category, String action, @Nullable Long orgId, @Nullable Long teamId, @Nullable Long memberId) {
		super();
		this.category = category;
		this.orgId = orgId;
		this.teamId = teamId;
		this.memberId = memberId;
		this.action = action;
	}
	
	
}
