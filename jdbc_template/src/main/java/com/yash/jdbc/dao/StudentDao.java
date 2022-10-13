package com.yash.jdbc.dao;

import java.util.List;

import com.yash.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student st);

	public int updateDetails(Student st);

	public int deleteDetails(int st_id);

	public Student selectDetails(int st_id);

	public List<Student> getAllDetails();
}
