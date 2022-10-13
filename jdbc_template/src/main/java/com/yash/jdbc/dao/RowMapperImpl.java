package com.yash.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.jdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setStid(rs.getInt(1));
		student.setSname(rs.getString(2));
		student.setAge(rs.getInt(3));
		student.setRollno(rs.getInt(4));
		return student;
	}

}
