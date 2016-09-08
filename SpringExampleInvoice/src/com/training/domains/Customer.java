/**
 * 
 */
package com.training.domains;

/**
 * @author akaul5
 *
 */
public class Customer {
 private long customerId;
 private String customerName;
 private String phoneNumber;
 private Address address;
/**
 * 
 */
public Customer() {
	super();
}
/**
 * @param customerId
 * @param customerName
 * @param phoneNumber
 * @param address
 */
public Customer(long customerId, String customerName, String phoneNumber, Address address) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.phoneNumber = phoneNumber;
	this.address = address;
}
/**
 * @return the customerId
 */
public long getCustomerId() {
	return customerId;
}
/**
 * @param customerId the customerId to set
 */
public void setCustomerId(long customerId) {
	this.customerId = customerId;
}
/**
 * @return the customerName
 */
public String getCustomerName() {
	return customerName;
}
/**
 * @param customerName the customerName to set
 */
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
/**
 * @return the phoneNumber
 */
public String getPhoneNumber() {
	return phoneNumber;
}
/**
 * @param phoneNumber the phoneNumber to set
 */
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
/**
 * @return the address
 */
public Address getAddress() {
	return this.address;
}
/**
 * @param address the address to set
 */
public void setAddress(Address address) {
	this.address = address;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber
			+ ", Address=" + this.address + "]";
}
 
}
