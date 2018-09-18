package com.demo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springMVC.xml");

		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService");

		System.out.println(demoService.sayHello("==========dubbo=========="));
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}