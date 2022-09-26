package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.User;

public class UserDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	public User saveUser(User u) {
		
		if(u!=null)
		{
			et.begin();
			em.persist(u);
			et.commit();
			return u;
		}
		else
		{
			return null;
		}
	}
	public User findUserById(int id)
	{
		if(id!=0)
		{
			et.begin();
			User u1 = em.find(User.class, id);
			et.commit();
			System.out.println("user found");
			return u1;
		}
		else
		{
			System.out.println("user not found");
			return null;
		}
	}
	public boolean deleteUser(int id)
	{
		if(id!=0)
		{
			et.begin();
			User u2 = em.find(User.class, id);
			em.remove(u2);
			et.commit();
			return true;
		}
		else
		{
			return false;
		}
	}
	public User updateUser(User user)
	{
		if(user!=null)
		{
			et.begin();
			em.merge(user);
			et.commit();
			return user;
		}
		else
		{
			System.out.println("user does not exist");
			return null;
		}
	}
}