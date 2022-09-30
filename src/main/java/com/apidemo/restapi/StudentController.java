package com.apidemo.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apidemo.restapi.entity.Student;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		List<Student> studentList = new ArrayList<>();
		Student s1 = new Student(1, "Jeevan", "Sai", "Tirupati", 10);
		Student s2 = new Student(2, "Sai", "V", "Banglore", 11);
		
		studentList.add(s1);
		studentList.add(s2);
		
		return studentList;
	}
}
