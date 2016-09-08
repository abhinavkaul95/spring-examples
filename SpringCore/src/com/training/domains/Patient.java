/**
 * 
 */
package com.training.domains;


import java.util.logging.Logger;

/**
 * @author akaul5
 *
 */
public class Patient {
private static final Logger log = Logger.getLogger("Logger");
private long patientId;
private String patientName;
private String patientType;
/**
 * 
 */
public Patient() {
	super();
	log.info("No-arg Constructor Initialised");
}
/**
 * @param patientId
 * @param patientName
 * @param patientType
 */
public Patient(long patientId, String patientName, String patientType) {
	super();
	this.patientId = patientId;
	this.patientName = patientName;
	this.patientType = patientType;
	log.info("Parameterized Constructor Initialised");
}
/**
 * @return the patientId
 */
public long getPatientId() {
	log.info("patientId getter called");
	return patientId;
	
}
/**
 * @param patientId the patientId to set
 */
public void setPatientId(long patientId) {
	log.info("patientId setter called");
	this.patientId = patientId;
}
/**
 * @return the patientName
 */
public String getPatientName() {
	log.info("patientName getter called");
	return patientName;
}
/**
 * @param patientName the patientName to set
 */
public void setPatientName(String patientName) {
	log.info("patientName setter called");
	this.patientName = patientName;
}
/**
 * @return the patientType
 */
public String getPatientType() {
	log.info("patientType getter called");
	return patientType;
}
/**
 * @param patientType the patientType to set
 */
public void setPatientType(String patientType) {
	log.info("patientType setter called");
	this.patientType = patientType;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientType=" + patientType + "]";
}

}
