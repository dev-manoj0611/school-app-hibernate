package com.ty.school.controller;

import com.ty.school.dao.StudentDao;
import com.ty.school.dto.Student;

public class StudentUpdateController {
	public static void main(String[] args) {
		StudentDao stud = new StudentDao();
		Student stu = new Student();
		stu.setRol(5);
		stu.setName("ganesh");
		stu.setPercentage(77.00);
		Student stur = stud.updateStudent(stu);
		System.out.println(" student "+stur+" updated");
	}
}