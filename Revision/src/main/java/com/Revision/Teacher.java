package com.Revision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	private int Tage;
	private String tname;
	private char tgender;
	private String subject;
	private boolean substitute;
	@Autowired
	private School school;
//	creates an object of scchool in spring container, making this object in the classes is called autowiring
//	if you don't do it, it won't be accessible her

	public School getSchool() {
		return school;
	}


	@Autowired
	public void setSchool(School school) {
		this.school = school;
	}

	@Autowired
	public Teacher(School school) {
		this.school = school;

	}

	public int getTage() {
		return Tage;
	}

	public void setTage(int tage) {
		Tage = tage;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public char getTgender() {
		return tgender;
	}

	public void setTgender(char tgender) {
		this.tgender = tgender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isSubstitute() {
		return substitute;
	}

	public void setSubstitute(boolean substitute) {
		this.substitute = substitute;
	}

	public void creatschool(String name, int district, int location) {
		
	}

	public void schoolinfo() {
		school.display();
		this.school = school;

		// TODO Auto-generated method stub
		
	}
	
	
}
