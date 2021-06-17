package com.example.demo.organizations.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.organizations.dto.OrgListDto;
import com.example.demo.organizations.dto.OrganizationCreateDto;
import com.example.demo.organizations.services.OrganizationServices;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

	@Autowired
	OrganizationServices orgServices;
	
	@GetMapping("")
	public ResponseEntity<Object> getAllOrg() {
		// Get data from service layer into entityList.
		List<OrgListDto> orgDtos = new ArrayList<>();
		orgDtos.add(new OrgListDto(1, "Org1", "This is a new org"));
		return new ResponseEntity<Object>(orgDtos, HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<Object> createOrg(@RequestBody OrganizationCreateDto organizationCreateDto) {
		// Get data from service layer into entityList.
		orgServices.createOrganization(organizationCreateDto);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
	
}
