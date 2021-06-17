package com.example.demo.audittrails.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.audittrails.entity.Log;
import com.example.demo.audittrails.repository.LogRepository;

@Service
public class LogServices {

	@Autowired
	LogRepository logRepo;
	
	public void createLog(Log log) {
		logRepo.save(log);
	}
}
