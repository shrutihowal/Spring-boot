package com.rpicloud.controllers;

import java.util.List;

import com.rpicloud.models.A;
import com.rpicloud.models.Pie;

public class RequestWrapper {
	Pie pie;
	List<A> a;

	public Pie getPie() {
		return pie;
	}

	public void setPie(Pie pie) {
		this.pie = pie;
	}

	public List<A> getA() {
		return a;
	}

	public void setA(List<A> a) {
		this.a = a;
	}

}
