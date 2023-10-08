package com.profile.student.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.profile.student.model.Student;
import com.profile.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getDetails() {

		Student student = new Student();
		student.setName("Rohan Bansal");
		student.setGender("Male");
		student.setAddress("Gurukul, Ahmedabad");
		student.setAbout("About");
		
		student.setId(23102);
		student.setClassName("VIII");
		student.setSection('A');
		student.setRollNo(101);
		student.setYear(2023);
		student.setCollegeName("Airport School Ahmedabad");
		student.setCollegeQuote("Slogan: Every wall is a door");
		
		student.setReligion("India");
		student.setParentName("Mahesh Bansal");
		student.setParentPhoneNumber("9517532864");
		
		student.setBlood("B+");
		
		
		ArrayList<String> h = new ArrayList<>();
		h.add("love to play Cricket");
		h.add("Video Gaming");
		student.setHobbies(h);
		
		ArrayList<String> s = new ArrayList<>();
		s.add("Cricket");
		s.add("Football");
		student.setSports(s);

		ArrayList<String> f = new ArrayList<>();
		f.add("Burger");
		f.add("Pizza");
		student.setFoods(f);
		

		
		return student;
	}
	
}
