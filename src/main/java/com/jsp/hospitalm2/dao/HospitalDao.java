package com.jsp.hospitalm2.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.hospitalm2.dto.Hospital;
import com.jsp.hospitalm2.repository.HospitalRepo;

@Repository
public class HospitalDao {
	
	@Autowired
	private HospitalRepo repo;

	public Hospital saveHospital(Hospital hospital) {
		return repo.save(hospital);
	}

	public Hospital findHospitalById(int hospitalId) {
		Optional<Hospital>  optional=repo.findById(hospitalId);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

}
