/**
 * 
 */
package com.training.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Doctor;

/**
 * @author akaul5
 *
 */
public class FirstExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")){
			Doctor doctorBean = ctx.getBean("docBean1",Doctor.class);
			System.out.println("Bean returned by IoC container : " + doctorBean);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
