/**
 * 
 */
package com.training.domains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author akaul5
 *
 */

@Component
public class LifeInsurance {
	@Autowired
	@Qualifier("cust")
	private Customer cust;
	@Value("1561564")
	private long policyNumber;
	@Value("3000.00")
	private double policyAmount;
	
	
	/**
	 * 
	 */
	public LifeInsurance() {
		super();
	}
	/**
	 * @param policyNumber
	 * @param policyAmount
	 */
	public LifeInsurance(long policyNumber, double policyAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyAmount = policyAmount;
	}
	
	
	
	/**
	 * @return the cust
	 */
	public Customer getCust() {
		return cust;
	}
	/**
	 * @param cust the cust to set
	 */
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	/**
	 * @return the policyNumber
	 */
	public long getPolicyNumber() {
		return policyNumber;
	}
	/**
	 * @param policyNumber the policyNumber to set
	 */
	

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	/**
	 * @return the policyAmount
	 */
	public double getPolicyAmount() {
		return policyAmount;
	}
	/**
	 * @param policyAmount the policyAmount to set
	 */

	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	public double findFirstPremium(){
		double firstPremium = 0.00;
		double premium = (policyAmount * 0.01);
		if(premium > 1500.00){
			firstPremium = premium - 500;
		}
		else{
			firstPremium = premium;
		}
		return firstPremium;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init called");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("Clean Up called");
	}
}
