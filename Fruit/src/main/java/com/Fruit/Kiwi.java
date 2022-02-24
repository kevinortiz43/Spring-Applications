package com.Fruit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kiwi {

	private Boolean issour;
	private double weight;
	
	@Autowired
	private Growing Grow;

	public Growing getGrow() {
		return Grow;
	}

	@Autowired
	public void setGrow(Growing grow) {
		Grow = grow;
	}

	public Kiwi() {
	}


	public Boolean getIssour() {
		return issour;
	}

	public void setIssour(Boolean issour) {
		this.issour = issour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	

}
