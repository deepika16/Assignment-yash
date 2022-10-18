package com.yash.service;

import java.util.List;

import com.yash.model.Student;

public interface StudentService {

	public Student getEmployee(int stId);

	public List<Student> getAllStudent();

	public Student addStudent(Student st);

	public Student modifyStudent(Student st);

	public String removeStudent(int stId);

	public Student getStudent(int getstId);
}
