package com.yash.spring.SpringProject3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring App");
		ApplicationContext c = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Rectangle r = (Rectangle) c.getBean("Rectangle");
		r.draw();
		Parallelogram p = (Parallelogram) c.getBean("Parallelogram");
		p.draw();
		Triangle t = (Triangle) c.getBean("Triangle");
		t.draw();
	}
}
