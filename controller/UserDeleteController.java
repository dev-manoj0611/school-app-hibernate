package com.ty.school.controller;

import com.ty.school.dao.UserDao;

public class UserDeleteController {
	public static void main(String[] args)
	{
		UserDao ud = new UserDao();
		boolean data = ud.deleteUser(4);
		if(data)
		{
			System.out.println("user deleted");
		}
		else
		{
			System.out.println("user does not exist");
		}
	}
}