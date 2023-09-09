package com.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {
		
		@Autowired
		CustomerService Cust;
		
		@PostMapping("/save")
		public Customer saveCustomer(@RequestBody Customer c) {
			return Cust.saveCustomer(c);
			
		}
		@PostMapping("/saveAll")
		public List<Customer> addAllCustomer(@RequestBody List<Customer> c){
			return Cust.addAllCustomer(c);
			
			
		}
		
	
}
