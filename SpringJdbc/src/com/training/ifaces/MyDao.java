/**
 * 
 */

package com.training.ifaces;

import java.util.List;

import com.training.entity.Customer;

/** My DAO interface.
 * @author akaul5
 *
 */

public interface MyDao<T> {
  public int add(T object);
  
  public Customer find(long key);
  
  public List<Customer> findAll();
}
