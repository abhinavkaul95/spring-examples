/**
 * 
 */
package com.training.model;

import org.springframework.stereotype.Component;

/**
 * @author akaul5
 *
 */
@Component
public class ServiceRequest {
  private String requestType;
  private long requestId;
  private String description;
  private long customerNumber;
  
/**
 * @param requestType
 * @param requestId
 * @param description
 * @param customerNumber
 */
public ServiceRequest(String requestType, long requestId, String description, long customerNumber) {
	super();
	this.requestType = requestType;
	this.requestId = requestId;
	this.description = description;
	this.customerNumber = customerNumber;
}
/**
 * 
 */
public ServiceRequest() {
	super();
}
/**
 * @return the requestType
 */
public String getRequestType() {
	return requestType;
}
/**
 * @param requestType the requestType to set
 */
public void setRequestType(String requestType) {
	this.requestType = requestType;
}
/**
 * @return the requestId
 */
public long getRequestId() {
	return requestId;
}
/**
 * @param requestId the requestId to set
 */
public void setRequestId(long requestId) {
	this.requestId = requestId;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * @return the customerNumber
 */
public long getCustomerNumber() {
	return customerNumber;
}
/**
 * @param customerNumber the customerNumber to set
 */
public void setCustomerNumber(long customerNumber) {
	this.customerNumber = customerNumber;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "ServiceRequest [requestType=" + requestType + ", requestId=" + requestId + ", description=" + description
			+ ", customerNumber=" + customerNumber + "]";
}
  
}
