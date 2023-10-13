package com.jsp.hospitalm2.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hospital {
    @Id
	private int id;
	private String name;
	
	@OneToMany
	private List<Branches> branches;
	
}
