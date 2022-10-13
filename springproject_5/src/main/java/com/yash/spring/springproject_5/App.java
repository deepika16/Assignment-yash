package com.yash.spring.springproject_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("com/yash/spring/springproject_5/applicationcontext.xml");
		SetterMessage s = (SetterMessage) c.getBean("settermessage");
		System.out.println(s);
	}
}
