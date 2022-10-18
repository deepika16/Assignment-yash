package com.yash.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.dao.StudentDao;
import com.yash.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao stDao;

	@Override
	public Student getStudent(int stId) {

		Student st = new Student();
		try {
			st = convertToStudent(stDao.findById(stId));
		} catch (Exception e) {
			System.out.println("exception while getting employee");
		}
		return st;
	}

	private Student convertToStudent(Optional<Student> st) {
		Student student = new Student();
		if (st != null) {
			student.setStId(st.get().getStId());
			student.setsName(st.get().getsName());
		}
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> empList = new ArrayList<>();
		try {
			empList = stDao.findAll();
		} catch (Exception e) {
			System.out.println("Exception while getting list of Employee");
		}
		return empList;
	}

	@Override
	public Student addStudent(Student st) {
		Student savedStudent = new Student();
		try {
			savedStudent = stDao.save(st);
		} catch (Exception e) {
			System.out.println("Exception while adding Employee");
		}
		return savedStudent;
	}

	@Override
	public Student modifyStudent(Student st) {
		Student student = new Student();
		try {
			student = getStudent(st.getStId());

			if (student != null) {
				student.setsName(st.getsName());
				stDao.save(student);
			}

		} catch (Exception e) {
			System.out.println("Exception while modifing Employee");
		}
		return student;
	}

	@Override
	public String removeStudent(int stId) {
		Student student = new Student();
		boolean flag = false;
		try {
			student = getStudent(stId);
			if (student != null) {
				stDao.deleteById(stId);
				flag = true;
			}
		} catch (Exception e) {
			System.out.println("Exception while removing Student");
		}
		if (flag) {
			return "student deleted Successfully with id= " + stId;
		} else {
			return "id " + stId + " does not exist";
		}
	}

	@Override
	public Student getEmployee(int stId) {
		// TODO Auto-generated method stub
		return null;
	}

}
