/**
 * 
 */
package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Customer;
import com.training.ifaces.MyDao;
import com.training.utils.CustomerDao;

/**
 * @author akaul5
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")){
			
			MyDao<Customer> custDao= ctx.getBean(CustomerDao.class);
			Customer cust = ctx.getBean(Customer.class);
			cust.setCustomerNumber(1564123);
			cust.setCustomerName("Ramesh");
			cust.setEmailId("ramesh@gmail.com");
			cust.setPhoneNumber("915642151");
			System.out.println(custDao.find(105));
			System.out.println(" <------------------------------- > ");
			for(Customer customer: custDao.findAll()){
				System.out.println(customer);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
