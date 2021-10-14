package com.example.studentManagement;

import com.example.studentManagement.entity.Student;
import com.example.studentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StudentManagementApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(StudentManagementApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

//	@Autowired
//	StudentRepository studentRepository;

//	@Override
//	public void run(String... args) throws Exception {
//
////		Student student1 = new Student("Robiul","Rony","rony@gmail.com");
////		studentRepository.save(student1);
////
////		Student student2 = new Student("Jahid","Hasan","jahid@gmail.com");
////		studentRepository.save(student2);
////
////		Student student3 = new Student("Rimon","Mia","rimon@gmail.com");
////		studentRepository.save(student3);
////		Student student4 = new Student("rifat","hasan","hasan@gmail.com");
////		studentRepository.save(student4);
//
//	}
}
