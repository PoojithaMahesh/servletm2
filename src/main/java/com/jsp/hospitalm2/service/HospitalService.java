package com.jsp.hospitalm2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.hospitalm2.dao.HospitalDao;
import com.jsp.hospitalm2.dto.Hospital;
import com.jsp.hospitalm2.util.ResponseStructure;

@Service
public class HospitalService {
	
	@Autowired
	private HospitalDao hospitalDao;

	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(Hospital hospital) {
		Hospital dbHospital=hospitalDao.saveHospital(hospital);
		ResponseStructure<Hospital>  structure=new ResponseStructure<Hospital>();
		structure.setMessage("Hospital saved successfully");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(dbHospital);
		return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.CREATED);
	}

}
