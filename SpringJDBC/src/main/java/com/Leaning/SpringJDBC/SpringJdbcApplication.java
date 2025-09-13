package com.Leaning.SpringJDBC;

import com.Leaning.SpringJDBC.model.Student;
import com.Leaning.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("sid");
		s.setMarks(90);

		StudentService studentService = context.getBean(StudentService.class);
		studentService.addStudent(s);

		List<Student> students = studentService.getStudents();
		System.out.println(students);
	}

}
