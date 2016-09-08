/**
 * 
 */
package com.training.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.training.model.ServiceRequest;

/**
 * @author akaul5
 *
 */
@Component
public class ServiceRequestDao {
  
  @Autowired
  private JdbcTemplate jdbcTemplate;
  @Autowired
  private BeanPropertyRowMapper<ServiceRequest> mapper;
  public int add(ServiceRequest serviceRequest) {
    String sql = "insert into servicerequest values(?,?,?,?)";
    int rowAdded = jdbcTemplate.update(sql, serviceRequest.getRequestType(), serviceRequest.getRequestId(), serviceRequest.getDescription(), serviceRequest.getCustomerNumber());
    return rowAdded;
  }
  public ServiceRequest find(long key) {
		String sql = "select * from servicerequest where requestId = ?";
		ServiceRequest serviceRequest = jdbcTemplate.queryForObject(sql,mapper,key);
		return serviceRequest;
	}
	public List<ServiceRequest> findAll() {
		String sql = "select * from servicerequest";
		List<ServiceRequest> reqList = jdbcTemplate.query(sql,mapper);
		return reqList;
	}
}
