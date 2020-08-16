package com.example.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.shop.model.Customer;
import com.example.shop.service.CustomerService;

@Controller
@RequestMapping("/dynamoDb")
public class ShopController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/addCustomer", method = {RequestMethod.POST}, consumes = "application/json")
	public String insertIntoDyanamoDB(@RequestBody Customer customer) {
		System.out.println("value in customer object"+ customer);
		customerService.insertCustomer(customer);
		return "successfully inserted in dynamo db";	
	}
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<Customer> getCustomerDetails(@RequestParam String CustomerId, @RequestParam String CustomerName)
	{
		Customer customer = customerService.getOneCustomerDetail(CustomerId,CustomerName);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

}
