package com.example.demo.organizations.services;

import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.audittrails.entity.Log;
import com.example.demo.audittrails.services.LogServices;
import com.example.demo.organizations.dto.OrganizationCreateDto;
import com.example.demo.organizations.entity.Organization;
import com.example.demo.organizations.repository.OrganizationRepository;

@Service
public class OrganizationServices {
	
	@Autowired
	OrganizationRepository orgRepo;
	
	@Autowired
	LogServices logService;

	public Organization createOrganization(OrganizationCreateDto orgPayload) {
		Organization org = new Organization();
		org.setName(orgPayload.getName());
		org.setDescription(orgPayload.getDescription());
		return orgRepo.save(org);
	}

	@After("execution(* orgRepo.save(..))")
	public void createLogInsert() {
		Log log = new Log("ORGANIZATION", "CREATE", null, null, null);
		logService.createLog(log);
	}


}
