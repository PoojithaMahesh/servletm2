package com.jsp.hospitalm2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.hospitalm2.dto.Branches;
import com.jsp.hospitalm2.service.BranchService;
import com.jsp.hospitalm2.util.ResponseStructure;

@RestController
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	private BranchService service;
	@PostMapping
	public ResponseEntity<ResponseStructure<Branches>> saveBranches(@RequestParam int hospitalId,   @RequestBody Branches branches){
		return service.saveBranch(hospitalId,branches);
	}
}
