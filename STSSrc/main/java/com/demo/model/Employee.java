package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	private int eid;
	private String ename;
	private int esalary;
	private String edesg;
	
	public Employee() {
		super();
			}

	public Employee(int eid, String ename, int esalary, String edesg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.edesg = edesg;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public String getEdesg() {
		return edesg;
	}

	public void setEdesg(String edesg) {
		this.edesg = edesg;
	} 

	
	
	
}
