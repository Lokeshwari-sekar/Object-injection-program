package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext cntxob=new ClassPathXmlApplicationContext("spring.xml");
		HumanBody humob=(HumanBody) cntxob.getBean("humanobj");
		humob.heartFunction();

	}

}
