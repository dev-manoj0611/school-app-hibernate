package com.ty.school.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class UserUpdateController {
	public static void main(String[] args) {
		UserDao ud = new UserDao();
		User u = new User();
		u.setId(5);
		u.setName("ganesh");
		u.setEmail("ganesh@gmail.com");
		u.setPassword("123");
		u.setPhone(7975983626L);
		u.setGender("male");
		User ur = ud.updateUser(u);
		System.out.println(" user "+ur+" updated");
	}
}