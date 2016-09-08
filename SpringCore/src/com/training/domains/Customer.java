/**
 * 
 */
package com.training.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author akaul5
 *
 */
@Component("cust")
public class Customer {
private long custId;
private String custName;
/**
 * 
 */
public Customer() {
	super();
}
/**
 * @param custId
 * @param custName
 */
@Autowired
public Customer(@Value("2020") long custId, @Value("Ramesh") String custName) {
	super();
	this.custId = custId;
	this.custName = custName;
}
/**
 * @return the custId
 */
public long getCustId() {
	return custId;
}
/**
 * @param custId the custId to set
 */
public void setCustId(long custId) {
	this.custId = custId;
}
/**
 * @return the custName
 */
public String getCustName() {
	return custName;
}
/**
 * @param custName the custName to set
 */
public void setCustName(String custName) {
	this.custName = custName;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + "]";
}



}
