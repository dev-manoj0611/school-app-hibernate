package com.ty.school.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class UserFetchController {

	public static void main(String[] args) {
		UserDao ud = new UserDao();
		User u = ud.findUserById(1);
		System.out.println(u);
	}
}