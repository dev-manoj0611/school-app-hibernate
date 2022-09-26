package com.ty.school.controller;

import com.ty.school.dao.StudentDao;

public class StudentDeleteController {
	public static void main(String[] args)
	{
		StudentDao ud = new StudentDao();
		boolean data = ud.deleteStudent(4);
		if(data)
		{
			System.out.println("student deleted");
		}
		else
		{
			System.out.println("student does not exist");
		}
	}
}