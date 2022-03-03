package com.sample.api.model;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "api")
public class SampleApi {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private char middle_initial;

	public SampleApi() {

	}

	public SampleApi(int id, String first_name, String last_name, char middle_initial) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.middle_initial = middle_initial;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public char getMiddle_initial() {
		return middle_initial;
	}

	public void setMiddle_initial(char middle_initial) {
		this.middle_initial = middle_initial;
	}

	
	
	
	
	
	
	
	
	
	
	
	

//    public sampleapi(int id, String name, int grade) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.grade = grade;
//	}
//    
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getGrade() {
//		return grade;
//	}
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//	
////	@Override
////	public String toString() {
////		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
////	}

}
