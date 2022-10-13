package com.yash.spring.SpringBoot4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       // System.out.println("Welcome to Spring App");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		ConstructorMessage m = (ConstructorMessage) context.getBean("e");
		System.out.println(m);
    }
}
