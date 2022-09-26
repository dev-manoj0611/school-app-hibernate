package com.ty.school.controller;

import com.ty.school.dao.StudentDao;
import com.ty.school.dto.Student;

public class StudentFetchController {

	public static void main(String[] args) {
		StudentDao stud = new StudentDao();
		Student stu = stud.findStudentById(1);
		System.out.println(stu);
	}
}