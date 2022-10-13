package com.yash.ORM_Spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.StudentDao;
import com.yash.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/ORM_Spring/config.xml");
		StudentDao stdao = context.getBean("StudentDao", StudentDao.class);
		Student s = new Student(1, "dipika");
//		int msg = stdao.insert(s);
//		stdao.updateDetails(s);
//		System.out.println(msg + "insertion done");
//		System.out.println("updation detail");
		
//		stdao.deleteDetails(0);
//		
//		System.out.println("delete");
		
		  List<Student> ls = stdao.getAllStudents();
	        for(Student s1 : ls) {
	        	System.out.println(s1);
	        }
	}
}
