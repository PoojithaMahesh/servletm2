package com.jsp.hospitalm2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.hospitalm2.dto.Branches;
import com.jsp.hospitalm2.repository.BranchRepo;

@Repository
public class BranchDao {

	@Autowired
	private BranchRepo repo;
	
	public Branches saveBranch(Branches branches) {
		return repo.save(branches);
	}
	
	
	
}
