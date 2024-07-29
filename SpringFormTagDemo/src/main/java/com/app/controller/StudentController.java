package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/ShowForm")
	public String showStudentForm(Model model) {
		Student s = new Student();
		model.addAttribute("Student", s);
		return "student-form";
	}

	@RequestMapping("/details")
	public String showStudentDetails(@ModelAttribute("student") Student theStudent) {
		System.out.println(theStudent);
		return "student-confirmation";
	}
}
