package com.example.studentApp;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.controller.StudentController;
import com.example.entity.StudentEntity;
import com.example.service.StudentView;

//@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StudentAppApplication.class, args);

		StudentEntity model = retrieveStudent();

		StudentView view = new StudentView();

		
		StudentController controller = new StudentController(model, view);

		controller.updateView();

		// update model
		controller.setStudentName("Bob");

	}

	private static StudentEntity retrieveStudent() {

		StudentEntity student = new StudentEntity();
		student.setName("Erik");
		student.setRollNo("15");

		return student;
	}
}
