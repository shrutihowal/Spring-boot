package com.rpicloud.dao;

public class ADao 
{
	private String typeA;
	private String typeB;

	public String getTypeA() {
		return typeA;
	}

	public void setTypeA(String typeA) {
		this.typeA = typeA;
	}

	public String getTypeB() {
		return typeB;
	}

	public void setTypeB(String typeB) {
		this.typeB = typeB;
	}

	@Override
	public String toString() {
		return "A [typeA=" + typeA + ", typeB=" + typeB + "]";
	}
}
