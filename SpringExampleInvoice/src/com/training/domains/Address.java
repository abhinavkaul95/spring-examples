package com.training.domains;

public class Address {
private String addressLineOne;
private String addressLineTwo;
private String city;
private String state;
private String country;
/**
 * @param addressLineOne
 * @param addressLineTwo
 * @param city
 * @param state
 * @param country
 */
public Address(String addressLineOne, String addressLineTwo, String city, String state, String country) {
	super();
	this.addressLineOne = addressLineOne;
	this.addressLineTwo = addressLineTwo;
	this.city = city;
	this.state = state;
	this.country = country;
}
/**
 * 
 */
public Address() {
	super();
}
/**
 * @return the addressLineOne
 */
public String getAddressLineOne() {
	return addressLineOne;
}
/**
 * @param addressLineOne the addressLineOne to set
 */
public void setAddressLineOne(String addressLineOne) {
	this.addressLineOne = addressLineOne;
}
/**
 * @return the addressLineTwo
 */
public String getAddressLineTwo() {
	return addressLineTwo;
}
/**
 * @param addressLineTwo the addressLineTwo to set
 */
public void setAddressLineTwo(String addressLineTwo) {
	this.addressLineTwo = addressLineTwo;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the country
 */
public String getCountry() {
	return country;
}
/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return addressLineOne + ", " + addressLineTwo + ", " + city
			+ ", " + state + ", " + country;
}

}
