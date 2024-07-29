package com.app.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentController {
     
	
List<Student> student = new ArrayList<Student>();
	
	public StudentController()
	{
		student.add(new Student(1,"Pranav","Keshware"));
		student.add(new Student(2,"Deepesh","Gupta"));
		student.add(new Student(3,"Kartik","Pandita"));
		student.add(new Student(4,"Shreyansh","Dubey"));
		student.add(new Student(5,"Bhupesh","Verma"));
	}
	
	@GetMapping("/hello")
	public String sayHello() 
	{
		return "Hello Java";	
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return student;
	}
	@GetMapping("/students/{studentId}")
	public Student getStudents(@PathVariable int studentId)
	{
		return student.get(studentId);
		
	}
}
