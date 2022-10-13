package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.aop.service.PaymentService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
		PaymentService paymentObject = context.getBean("payment", PaymentService.class);

		// auth, print:PaymentStarted
		paymentObject.makePayment(100);
	}
}
