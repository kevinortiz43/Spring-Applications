package com.Revision;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class School {

	private String sname;
	private String slocation;
	private int districnum;

	public School() {

	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSlocation() {
		return slocation;
	}

	public void setSlocation(String slocation) {
		this.slocation = slocation;
	}

	public int getDistricnum() {
		return districnum;
	}

	public void setDistricnum(int districnum) {
		this.districnum = districnum;

	}

	public void display() {

		System.out.println("School [sname=" + sname + ", slocation=" + slocation + ", districnum=" + districnum);
	}

}
