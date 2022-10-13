package com.yash.spring.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to the Second Spring App");
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationcontext.xml");
		PrintMessage p = (PrintMessage) c.getBean("printmessage");
		System.out.println(p);
	}
}
