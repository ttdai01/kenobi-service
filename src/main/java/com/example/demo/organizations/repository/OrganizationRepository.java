package com.example.demo.organizations.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.organizations.entity.Organization;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
