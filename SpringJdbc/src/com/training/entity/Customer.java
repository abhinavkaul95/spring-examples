/**
 * 
 */

package com.training.entity;

import org.springframework.stereotype.Component;

/** Customer Class.
 * @author akaul5
 *
 */
@Component
public class Customer {
  
  /** customerNumber.
   * customerNumber
   */
  
  private long customerNumber;
  
  /** customerName.
   * customerName
   */

  private String customerName;
  
  /** emailId.
   * emailId
   */
  
  private String emailId;
  
  /** phoneNumber.
   * phoneNumber
   */
  
  private String phoneNumber;
  
  /** No-arg constructor.
   * 
   */
  
  public Customer() {
    super();
  }
  
  /** Parameterized constructor.
   * @param customerNumber customerNumber
   * @param customerName customerName
   * @param emailId emailId
   * @param phoneNumber phoneNumber
   */
  
  public Customer(final long customerNumber, final String customerName, final String emailId, final String phoneNumber) {
    super();
    this.customerNumber = customerNumber;
    this.customerName = customerName;
    this.emailId = emailId;
    this.phoneNumber = phoneNumber;
  }
  
  /** Returns the customerNumber.
   * @return the customerNumber
   */
  
  public long getCustomerNumber() {
    return customerNumber;
  }
  
  /** Sets the customerNumber.
   * @param customerNumber the customerNumber to set
   */
  
  public void setCustomerNumber(final long customerNumber) {
    this.customerNumber = customerNumber;
  }
  
  /** Returns the customerName.
   * @return the customerName
   */
  
  public String getCustomerName() {
    return customerName;
  }
  
  /** Sets the customerName.
   * @param customerName the customerName to set
   */
  
  public void setCustomerName(final String customerName) {
    this.customerName = customerName;
  }
  
  /** Returns the emailId.
   * @return the emailId
   */
  
  public String getEmailId() {
    return emailId;
  }
  
  /** Sets the emailId.
   * @param emailId the emailId to set
   */
  
  public void setEmailId(final String emailId) {
    this.emailId = emailId;
  }
  
  /** Returns the phoneNumber.
   * @return the phoneNumber
   */
  
  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  /** Sets the phoneNumber.
   * @param phoneNumber the phoneNumber to set
   */
  
  public void setPhoneNumber(final String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  
  /** Changes to string representation.
   * @return the string representation
   */
  
  @Override
  public String toString() {
    return "Customer [customerNumber=" + customerNumber + ", customerName=" 
        + customerName + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber + "]";
  }
}
