package com.example.entity;




import javax.persistence.Entity;
/// Object or POJO
@Entity
public class StudentEntity {
	// setting out fields
	private String rollNo;
	private String name;
	
	// creating our getters and setters
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}