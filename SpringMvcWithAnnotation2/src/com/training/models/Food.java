/**
 * 
 */
package com.training.models;

import org.hibernate.validator.constraints.*;
import org.springframework.stereotype.Component;

/**
 * @author akaul5
 *
 */
@Component
public class Food {


private Long foodCode;

@NotEmpty(message="Description cannot be empty")
private String description;
private double ratePerUnit;
private String cuisine;
/**
 * 
 */
public Food() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param foodCode
 * @param description
 * @param ratePerUnit
 */
public Food(long foodCode, String description, double ratePerUnit, String cuisine) {
	super();
	this.foodCode = foodCode;
	this.description = description;
	this.ratePerUnit = ratePerUnit;
	this.cuisine = cuisine;
}
/**
 * @return the foodCode
 */
public Long getFoodCode() {
	return foodCode;
}
/**
 * @param foodCode the foodCode to set
 */
public void setFoodCode(Long foodCode) {
	this.foodCode = foodCode;
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
 * @return the ratePerUnit
 */
public double getRatePerUnit() {
	return ratePerUnit;
}
/**
 * @param ratePerUnit the ratePerUnit to set
 */
public void setRatePerUnit(double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
}

/**
 * @return the cuisine
 */
public String getCuisine() {
	return cuisine;
}
/**
 * @param cuisine the cuisine to set
 */
public void setCuisine(String cuisine) {
	this.cuisine = cuisine;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Food [foodCode=" + foodCode + ", description=" + description + ", ratePerUnit=" + ratePerUnit + "]";
}

}
