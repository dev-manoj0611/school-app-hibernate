package com.ty.school.controller;

import com.ty.school.dao.StudentDao;
import com.ty.school.dto.Student;

public class StudentSaveController {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setRol(1);
		stu1.setName("manoj");
		stu1.setPercentage(85.26);
		StudentDao stud1 = new StudentDao();
		Student stu1r = stud1.saveStudent(stu1);
		System.out.println(stu1r);
		Student stu2 = new Student();
		stu2.setRol(2);
		stu2.setName("harsh");
		stu2.setPercentage(58.26);
		StudentDao stud2 = new StudentDao();
		Student stu2r = stud2.saveStudent(stu2);
		System.out.println(stu2r);
		Student stu3 = new Student();
		stu3.setRol(3);
		stu3.setName("jeevan");
		stu3.setPercentage(77.56);
		StudentDao stud3 = new StudentDao();
		Student stu3r = stud3.saveStudent(stu3);
		System.out.println(stu3r);
		Student stu4 = new Student();
		stu4.setRol(4);
		stu4.setName("madan");
		stu4.setPercentage(71.00);
		StudentDao stud4 = new StudentDao();
		Student stu4r = stud4.saveStudent(stu4);
		System.out.println(stu4r);
		Student stu5 = new Student();
		stu5.setRol(5);
		stu5.setName("varsha");
		stu5.setPercentage(66);
		StudentDao stud5 = new StudentDao();
		Student stu5r = stud5.saveStudent(stu5);
		System.out.println(stu5r);
	}
}