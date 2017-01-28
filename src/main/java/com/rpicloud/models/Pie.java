package com.rpicloud.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Created by kaspernissen on 11/02/2016.
 */
@Entity
@Table(name = "PIE")
public class Pie {

	@Id
	private String pid;
	private String name;
	private String description;
	@OneToMany
	List<A> objA;

	// for JPA
	public Pie() {
	}

	public Pie(String pid, String name, String description, List<A> objA) 
	{
		super();
		this.pid = pid;
		this.name = name;
		this.description = description;
		this.objA = objA;
	}	
	
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
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
		return "Pie [id=" + pid + ", name=" + name + ", description="
				+ description + ", objA=" + objA + "]";
	}

}
