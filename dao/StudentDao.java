package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Student;

public class StudentDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	public Student saveStudent(Student stu) {
		
		if(stu!=null)
		{
			et.begin();
			em.persist(stu);
			et.commit();
			return stu;
		}
		else
		{
			return null;
		}
	}
	public Student findStudentById(int rol)
	{
		if(rol!=0)
		{
			et.begin();
			Student stu1 = em.find(Student.class, rol);
			et.commit();
			System.out.println("Student found");
			return stu1;
		}
		else
		{
			System.out.println("Student not found");
			return null;
		}
	}
	public boolean deleteStudent(int rol)
	{
		if(rol!=0)
		{
			et.begin();
			Student u2 = em.find(Student.class, rol);
			em.remove(u2);
			et.commit();
			return true;
		}
		else
		{
			return false;
		}
	}
	public Student updateStudent(Student stu)
	{
		if(stu!=null)
		{
			et.begin();
			em.merge(stu);
			et.commit();
			return stu;
		}
		else
		{
			System.out.println("Student does not exist");
			return null;
		}
	}
}