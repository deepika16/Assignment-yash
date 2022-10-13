package com.yash.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbctemp;

	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

	public int insert(Student st) {
		String q = "insert into student(stid, sname,age,rollno) values(?,?,?,?)";
		int m = this.jdbctemp.update(q, st.getStid(), st.getSname(), st.getAge(), st.getRollno());
		return m;
	}

	public int updateDetails(Student st) {
		String q = "update student set sname=?,age=?, rollno=? where stid=?";
		int m = this.jdbctemp.update(q, st.getSname(), st.getStid(), st.getAge(), st.getRollno());
		return m;
	}

	public int deleteDetails(int stid) {
		String q = "delete from student where stid=?";
		int m = this.jdbctemp.update(q, stid);
		return m;
	}

	public Student selectDetails(int st_id) {
		String q = "select * from student where id=?";
		RowMapper<Student> rowmapper = new RowMapperImpl();
		Student st = this.jdbctemp.queryForObject(q, rowmapper, st_id);
		return st;
	}

	public List<Student> getAllDetails() {
		String q = "select * from student";
		List<Student> st = this.jdbctemp.query(q, new RowMapperImpl());
		return st;
	}

}
