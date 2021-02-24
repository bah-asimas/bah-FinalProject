package com.ja.msd.mcc.api;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ja.msd.mcc.domain.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {

	ArrayList<Customer> customerList = new ArrayList<Customer>();

	public CustomerAPI() {
		Customer c1 = new Customer(1, "Anthony", "pass", "anthony@abc.com");
		Customer c2 = new Customer(1, "Jessica", "pass", "jessica@abc.com");
		customerList.add(c1);
		customerList.add(c2);
	}
	
	@GetMapping
	public String getAll() {
		String response = "[ ";
		for (int i = 0; i < customerList.size(); i++) {
			response += customerList.get(i).toJSON();
			if (i + 1 < customerList.size()) {
				response += ", ";
			}
		}
		response += " ]";
		return response;
	}

	public void setListCustomers(ArrayList<Customer> listOfCustomers) {
		this.customerList = listOfCustomers;
	}
	@GetMapping("/{customerId}")
	public String getCustomerById(@PathVariable("customerId") long id) {
		String response = "{}";
		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getId() == id) {
				response = customerList.get(i).toJSON();
			}
		}
		return response;
	}


	
	
}
