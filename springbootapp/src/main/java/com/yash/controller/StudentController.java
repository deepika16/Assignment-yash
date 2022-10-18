package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Student;
import com.yash.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/getStudentById/{getstId}")
	public Student getStudent(@PathVariable("getstId") int getstId) {
		Student student = studentService.getStudent(getstId);
		return student;
	}

	@GetMapping("/allStudent")
	public List<Student> getAllStudent() {
		List<Student> getAllStudent = studentService.getAllStudent();
		return getAllStudent;
	}

	@GetMapping(path = "/getallStudent", produces = MediaType.APPLICATION_XML_VALUE)
	public List<Student> AllEmployee() {
		List<Student> getAllStudent = studentService.getAllStudent();
		return getAllStudent;
	}

	@PostMapping("/insertStudent")
	public Student addStudent(@RequestBody Student st) {
		Student addStudent = studentService.addStudent(st);
		return addStudent;
	}

	@PutMapping("/updateStudent/{stId}")
	public Student modifyStudent(@RequestBody Student st) {
		Student modifyStudent = studentService.modifyStudent(st);
		return modifyStudent;
	}

	@DeleteMapping("/deleteStudent/{deleteId}")
	public String removeStudent(@PathVariable("deleteId") int deleteId) {
		String removeStudent = studentService.removeStudent(deleteId);
		return removeStudent;
	}

}
