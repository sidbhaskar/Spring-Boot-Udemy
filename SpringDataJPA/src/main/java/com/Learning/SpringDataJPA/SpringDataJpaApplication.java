package com.Learning.SpringDataJPA;

import com.Learning.SpringDataJPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Sid");
//		s1.setMarks(90);
//
//		s2.setRollNo(102);
//		s2.setName("Kiran");
//		s2.setMarks(91);
//
//		s3.setRollNo(103);
//		s3.setName("Harsh");
//		s3.setMarks(92);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());
//		System.out.println(repo.findById(103));

		System.out.println(repo.findByName("Sid"));
	}

}
