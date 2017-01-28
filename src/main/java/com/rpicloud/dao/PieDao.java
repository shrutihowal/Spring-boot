package com.rpicloud.dao;

import java.util.List;

import javax.persistence.OneToMany;

import com.rpicloud.models.A;

public class PieDao {
	private String id;
	private String name;
	private String description;
	List<A> objA;

	// for JPA
	public PieDao() {
	}

	public PieDao(String id, String name, String description, List<A> objA) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.objA = objA;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public List<A> getObjA() {
		return objA;
	}

	public void setObjA(List<A> objA) {
		this.objA = objA;
	}

	@Override
	public String toString() {
		return "Pie [id=" + id + ", name=" + name + ", description="
				+ description + ", objA=" + objA + "]";
	}

}
