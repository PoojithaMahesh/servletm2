package com.jsp.hospitalm2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospitalm2.dto.Hospital;
import com.jsp.hospitalm2.service.HospitalService;
import com.jsp.hospitalm2.util.ResponseStructure;

@RestController
@RequestMapping("/hos")
public class HospitalController {
	
	@Autowired
	private HospitalService service;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(@RequestBody Hospital hospital){
		return service.saveHospital(hospital);
	}
	

}
