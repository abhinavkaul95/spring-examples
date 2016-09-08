/**
 * 
 */
package com.training.domains;

import java.util.List;


/**
 * @author akaul5
 *
 */
public class Invoice {
	private long invoiceNumber;
	private Customer customer;
	private double amount;
	private List<Item> itemList;
	/**
	 * 
	 */
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param invoiceNumber
	 * @param customer
	 * @param amount
	 * @param itemList
	 */
	public Invoice(long invoiceNumber, Customer customer, double amount, List<Item> itemList) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customer = customer;
		this.amount = amount;
		this.itemList = itemList;
	}
	/**
	 * @return the invoiceNumber
	 */
	public long getInvoiceNumber() {
		return invoiceNumber;
	}
	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the itemList
	 */
	public List<Item> getItemList() {
		return itemList;
	}
	/**
	 * @param itemList the itemList to set
	 */
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", customer=" + customer + ", amount=" + amount
				+ ", itemList=" + itemList + "]";
	}
	
	
	public void init() {
		System.out.println("Resources created");
	}
	

	public void cleanup(){
		System.out.println("Resources destroyed");
	}
}
