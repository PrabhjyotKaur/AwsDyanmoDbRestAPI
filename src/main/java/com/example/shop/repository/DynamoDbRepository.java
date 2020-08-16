package com.example.shop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.shop.model.Customer;

@Repository
public class DynamoDbRepository {
	
	@Autowired
	private DynamoDBMapper mapper;

	public void insertIntoDyanamoDB(Customer customer) {
		mapper.save(customer);
	}

	public Customer getOneCustomerDetail(String customerId, String customerName) {
		return mapper.load(Customer.class, customerId, customerName);
	}

}
