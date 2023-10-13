package com.jsp.hospitalm2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.hospitalm2.dto.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer>{

}
