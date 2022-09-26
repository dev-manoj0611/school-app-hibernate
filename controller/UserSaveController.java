package com.ty.school.controller;

import com.ty.school.dao.UserDao;
import com.ty.school.dto.User;

public class UserSaveController {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setId(1);
		u1.setName("manoj");
		u1.setEmail("manoj@gmail.com");
		u1.setPassword("123");
		u1.setPhone(7975983189L);
		u1.setGender("male");
		UserDao ud1 = new UserDao();
		User u1r = ud1.saveUser(u1);
		System.out.println(u1r);
		User u2 = new User();
		u2.setId(2);
		u2.setName("harsh");
		u2.setEmail("harsh@gmail.com");
		u2.setPassword("456");
		u2.setPhone(9902319572L);
		u2.setGender("male");
		UserDao ud2 = new UserDao();
		User u2r = ud2.saveUser(u2);
		System.out.println(u2r);
		User u3 = new User();
		u3.setId(3);
		u3.setName("jeevan");
		u3.setEmail("jeevan@gmail.com");
		u3.setPassword("789");
		u3.setPhone(9945031486L);
		u3.setGender("male");
		UserDao ud3 = new UserDao();
		User u3r = ud3.saveUser(u3);
		System.out.println(u3r);
		User u4 = new User();
		u4.setId(4);
		u4.setName("madan");
		u4.setEmail("madan@gmail.com");
		u4.setPassword("");
		u4.setPhone(9902319572L);
		u4.setGender("male");
		UserDao ud4 = new UserDao();
		User u4r = ud4.saveUser(u4);
		System.out.println(u4r);
		User u5 = new User();
		u5.setId(5);
		u5.setName("varsha");
		u5.setEmail("varsha@gmail.com");
		u5.setPassword("");
		u5.setPhone(8989789320L);
		u5.setGender("female");
		UserDao ud5 = new UserDao();
		User u5r = ud5.saveUser(u5);
		System.out.println(u5r);
	}
}