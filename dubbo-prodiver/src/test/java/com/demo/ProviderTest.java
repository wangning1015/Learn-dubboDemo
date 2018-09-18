package com.demo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springMVC.xml");
		context.start();

		System.out.println("Dubbo provider start...");

		try {
			System.in.read(); // 按任意键退出
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}