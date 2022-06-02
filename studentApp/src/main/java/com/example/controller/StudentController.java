package com.example.controller;

import com.example.entity.StudentEntity;
import com.example.service.StudentView;

public class StudentController {
	// using our model and view to update and control the data being passed through
	private StudentEntity model;
	private StudentView view;
	// constructor
	public StudentController(StudentEntity model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	// control the getters and setters from out model
	public String getStudentName() {
		return model.getName();
	}

	public void setStudentName(String name) {
		model.setName(name);
	}
	
	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}
	
	public String getStudentRollNo() {
		return model.getRollNo();
	}

	// use the method from the view to get the updated fields
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}