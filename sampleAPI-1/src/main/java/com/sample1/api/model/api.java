package com.sample1.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "api")
public class api {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	private String firstName;
	private String lName;
	private String mInitial;

	public api() {

	}

	public api(int id, String firstName, String lName, String mInitial) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lName = lName;
		this.mInitial = mInitial;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getmInitial() {
		return mInitial;
	}

	public void setmInitial(String mInitial) {
		this.mInitial = mInitial;
	}

	
}
