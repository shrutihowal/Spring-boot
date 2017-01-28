package com.rpicloud.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="A")

public class A {
	private Long AId; 
	private String pid;
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Long getAId() {
		return AId;
	}

	public void setAId(Long id) {
		AId = id;
	}
    
	@Id
	private String typeA;
	
	public String getTypeA() {
		return typeA;
	}

	public void setTypeA(String typeA) {
		this.typeA = typeA;
	}

	
	

	public A(String typeA) {
		this.typeA = typeA;
		
	}
	
	public A()
	{
		
	}
	
	
}
