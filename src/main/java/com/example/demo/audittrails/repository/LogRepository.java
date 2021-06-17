package com.example.demo.audittrails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.audittrails.entity.Log;

@Repository
public interface LogRepository extends JpaRepository<Log, Long>{

}
