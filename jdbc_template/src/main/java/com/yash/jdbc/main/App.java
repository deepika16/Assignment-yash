package com.yash.jdbc.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.jdbc.dao.StudentDao;
import com.yash.jdbc.dao.StudentDaoImpl;
import com.yash.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/jdbc/main/applicationcontext.xml");
        StudentDaoImpl stdao = context.getBean("StudentDao", StudentDaoImpl.class);
        Student s = new Student();
        s.setStid(4);
        s.setSname("Deepika");
        s.setAge(28);
        s.setRollno(108);
		int r=stdao.insert(s);//insert the details
		int r1=stdao.updateDetails(s);//update the details
        //int r=stdao.deleteDetails(1);
        System.out.println(r);
        
        List<Student> ls = stdao.getAllDetails();
        for(Student s1 : ls) {
        	System.out.println(s1);
        }
    }
}
