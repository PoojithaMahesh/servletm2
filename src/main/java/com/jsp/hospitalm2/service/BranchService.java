package com.jsp.hospitalm2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.hospitalm2.dao.BranchDao;
import com.jsp.hospitalm2.dao.HospitalDao;
import com.jsp.hospitalm2.dto.Branches;
import com.jsp.hospitalm2.dto.Hospital;
import com.jsp.hospitalm2.util.ResponseStructure;

@Service
public class BranchService {

	@Autowired
	private BranchDao branchDao;
	@Autowired
	private HospitalDao hospitalDao;
	
	public ResponseEntity<ResponseStructure<Branches>> saveBranch(int hospitalId,Branches branches){
	Hospital dbHospital=hospitalDao.findHospitalById(hospitalId);
	if(dbHospital!=null) {
//		hospital is present then i can establish the branches
		
		List<Branches> listOfBranches=dbHospital.getBranches();
		listOfBranches.add(branches);
		
		dbHospital.setBranches(listOfBranches);
		
		Branches dbBranches=branchDao.saveBranch(branches);
		ResponseStructure<Branches> structure=new ResponseStructure<Branches>();
		structure.setMessage("Branches Saved successfully");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(dbBranches);
		return new ResponseEntity<ResponseStructure<Branches>>(structure,HttpStatus.CREATED);
		
		
		
	}else {
		return null;
//		throw hospital id not found exception
	}
	
	
	
	}
	
	
}
