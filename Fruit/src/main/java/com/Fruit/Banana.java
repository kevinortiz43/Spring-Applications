package com.Fruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Banana {

	
	private Boolean isbundle;
	private double balength;

	@Autowired
	private Growing Grow;

	public Growing getGrow() {
		return Grow;
	}

	@Autowired
	public void setGrow(Growing grow) {
		Grow = grow;
	}

	public Banana() {

	}


	public Boolean getIsbundle() {
		return isbundle;
	}

	public void setIsbundle(Boolean isbundle) {
		this.isbundle = isbundle;
	}

	public double getBalength() {
		return balength;
	}

	public void setBalength(double balength) {
		this.balength = balength;
	}


	
	
	
	

}
