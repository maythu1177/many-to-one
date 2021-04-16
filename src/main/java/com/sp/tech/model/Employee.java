package com.sp.tech.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;
	private int age;
	private String experties;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Department department;
	
	public Employee(String name, int age, String experties) {
		super();
		this.name = name;
		this.age = age;
		this.experties = experties;
	}
	
	

}
