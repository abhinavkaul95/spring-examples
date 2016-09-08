package com.training.domains;

import java.util.List;

public class Doctor {
private int doctorCode;
private String doctorName;
private String specialization;
private List<Patient> patientList;

/**
 * 
 */
public Doctor() {
	super();
}
/**
 * @param doctorCode
 * @param doctorName
 * @param specialization
 */
public Doctor(int doctorCode, String doctorName, String specialization, List<Patient> patientList) {
	super();
	this.doctorCode = doctorCode;
	this.doctorName = doctorName;
	this.specialization = specialization;
	this.patientList = patientList;
}
/**
 * @return the doctorCode
 */
public int getDoctorCode() {
	return doctorCode;
}
/**
 * @param doctorCode the doctorCode to set
 */
public void setDoctorCode(int doctorCode) {
	this.doctorCode = doctorCode;
}
/**
 * @return the doctorName
 */
public String getDoctorName() {
	return doctorName;
}
/**
 * @param doctorName the doctorName to set
 */
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
/**
 * @return the specialization
 */
public String getSpecialization() {
	return specialization;
}
/**
 * @param specialization the specialization to set
 */
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

/**
 * @return the patient
 */
public List<Patient> getPatientList() {
	return patientList;
}
/**
 * @param patient the patient to set
 */
public void setPatientList(List<Patient> patientList) {
	this.patientList = patientList;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Doctor [doctorCode=" + doctorCode + ", doctorName=" + doctorName + ", specialization=" + specialization
			+ ", patientList=" + patientList + "]";
}



}
