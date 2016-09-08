/**
 * 
 */
package com.training.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.LifeInsurance;

/**
 * @author akaul5
 *
 */
public class SecondApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")){
			LifeInsurance insBean =  ctx.getBean(LifeInsurance.class);
			System.out.println(insBean.getCust());
			System.out.println(insBean.getPolicyAmount());
			System.out.println(insBean.getPolicyNumber());
			System.out.println(insBean.findFirstPremium());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
