package com.Revision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RevisionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(RevisionApplication.class, args);

		Student s1 = Context.getBean(Student.class);
		Teacher t1 = Context.getBean(Teacher.class);
		School school1 = Context.getBean(School.class);
		School school2 = Context.getBean(School.class);

		school1.setDistricnum(13);
		school1.setSlocation("Brooklyn");
		school1.setSname("Some higschool name");
		school2.setDistricnum(15);
		school2.setSlocation("Manhattan");
		school2.setSname("LI school");

		s1.setSchool(school1);
		t1.setSchool(school2);
		s1.getSchool().display();
		t1.schoolinfo();

	}

}
