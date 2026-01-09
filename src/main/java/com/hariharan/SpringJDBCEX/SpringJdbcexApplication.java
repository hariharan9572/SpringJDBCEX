package com.hariharan.SpringJDBCEX;

import com.hariharan.SpringJDBCEX.model.Student;
import com.hariharan.SpringJDBCEX.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcexApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcexApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Hari");
		s.setMarks(75);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
