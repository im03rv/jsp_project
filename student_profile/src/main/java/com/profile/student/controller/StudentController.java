package com.profile.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.profile.student.model.Student;
import com.profile.student.service.StudentService;

@Controller
@RequestMapping("/profile")
public class StudentController {
	
//	@ResponseBody
//	@GetMapping("/check")
//	public String check() {
//		return "Welcome!!!";
//	}
	@Autowired
	private StudentService studentService;

	@GetMapping("/view")
	public ModelAndView displayTemplate() {
		ModelAndView modelAndView = new ModelAndView();

		Student student = studentService.getDetails();
		modelAndView.addObject("s",student);
		System.err.println(student.getName());
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
