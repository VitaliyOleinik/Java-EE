package com.dto;

public class Students {
	
	private Long id;
	private String name;
	private String surname;
	private double gpa;
	private int ent;
	private String groupName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public int getEnt() {
		return ent;
	}
	public void setEnt(int ent) {
		this.ent = ent;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Students() {

	}
	public Students(Long id, String name, String surname, double gpa, int ent, String groupName) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.gpa = gpa;
		this.ent = ent;
		this.groupName = groupName;
	}	
	
	
	
}
