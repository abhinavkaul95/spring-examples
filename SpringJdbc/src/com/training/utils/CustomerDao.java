/**
 * 
 */
package com.training.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.training.entity.Customer;
import com.training.ifaces.MyDao;

/**
 * @author akaul5
 *
 */
@Component
public class CustomerDao implements MyDao<Customer>{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private BeanPropertyRowMapper<Customer> mapper;
	
	
	
	/**
	 * 
	 */
	public CustomerDao() {
		super();
	}

	@Override
	public int add(Customer customer) {
		String sql = "insert into customer values(?,?,?,?)";
		int rowAdded = jdbcTemplate.update(sql, customer.getCustomerNumber(), customer.getCustomerName(), customer.getEmailId(), customer.getPhoneNumber());
		return rowAdded;
	}

	@Override
	public Customer find(long key) {
		String sql = "select * from customer where customerNumber = ?";
		Customer cust = jdbcTemplate.queryForObject(sql,mapper,key);
		return cust;
	}

	@Override
	public List<Customer> findAll() {
		String sql = "select * from customer";
		List<Customer> custList = jdbcTemplate.query(sql,mapper);
		return custList;
	}

}
