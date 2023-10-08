package com.profile.student.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class StudentDto {
	private long id;
	private String name;
	private String about;
	private String className;
	private char section;
	private String collegeName;
	private String collegeQuote;
	private int rollNo;
	private int year;
	private String blood;
	private String religion;
	private String gender;
	private String phoneNo;
	private String address;
	private String parentName;
	private String parentPhoneNumber;
	private List<String> hobbies;
	private List<String> sports;
	private List<String> foods;

}
