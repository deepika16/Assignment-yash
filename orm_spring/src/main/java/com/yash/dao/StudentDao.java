package com.yash.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.yash.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernatetemp;

	@Transactional
	public int insert(Student st) {
		Integer i = (Integer) this.hibernatetemp.save(st);
		return i;
	}
	
	@Transactional
	public void updateDetails(Student stu)
	{
		this.hibernatetemp.update(stu);
	}
	
	@Transactional
	public void deleteDetails(int stuid)
	{
		Student stu=this.hibernatetemp.get(Student.class,stuid);
		this.hibernatetemp.delete(stu);
	}
	
	public List<Student> getAllStudents()
	{
		List<Student> stu=this.hibernatetemp.loadAll(Student.class);
		return stu;
	}

	public HibernateTemplate getHibernatetemp() {
		return hibernatetemp;
	}

	public void setHibernatetemp(HibernateTemplate hibernatetemp) {
		this.hibernatetemp = hibernatetemp;
	}
	
	



}
