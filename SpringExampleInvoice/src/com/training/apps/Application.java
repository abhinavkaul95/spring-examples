package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;

public class Application {
public static void main(String[] ar) {
	try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")){
		Invoice inv = ctx.getBean(Invoice.class);
		System.out.println(inv);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
