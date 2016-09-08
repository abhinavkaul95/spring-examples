/**
 * 
 */
package com.training.domains;

/**
 * @author akaul5
 *
 */
public class Item {
private long itemId;
private String itemName;
private int ratePerUnit;
/**
 * 
 */
public Item() {
	super();
}
/**
 * @param itemId
 * @param itemName
 * @param ratePerUnit
 */
public Item(long itemId, String itemName, int ratePerUnit) {
	super();
	this.itemId = itemId;
	this.itemName = itemName;
	this.ratePerUnit = ratePerUnit;
}
/**
 * @return the itemId
 */
public long getItemId() {
	return itemId;
}
/**
 * @param itemId the itemId to set
 */
public void setItemId(long itemId) {
	this.itemId = itemId;
}
/**
 * @return the itemName
 */
public String getItemName() {
	return itemName;
}
/**
 * @param itemName the itemName to set
 */
public void setItemName(String itemName) {
	this.itemName = itemName;
}
/**
 * @return the ratePerUnit
 */
public int getRatePerUnit() {
	return ratePerUnit;
}
/**
 * @param ratePerUnit the ratePerUnit to set
 */
public void setRatePerUnit(int ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Item [itemId=" + itemId + ", itemName=" + itemName + ", ratePerUnit=" + ratePerUnit + "]";
}

}
