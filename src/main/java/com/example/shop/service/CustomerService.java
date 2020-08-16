package com.example.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shop.model.Customer;
import com.example.shop.repository.DynamoDbRepository;

@Service
public class CustomerService {
	@Autowired
	DynamoDbRepository dynamoDbRepository;
	
	public void insertCustomer(Customer customer)
	{
		dynamoDbRepository.insertIntoDyanamoDB(customer);
	}

	public Customer getOneCustomerDetail(String customerId, String customerName) {
		Customer Customer = dynamoDbRepository.getOneCustomerDetail(customerId, customerName);
		return Customer;
	}
	

}
