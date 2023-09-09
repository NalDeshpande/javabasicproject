package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerRepository;
import com.model.Customer;

@Service
public class CustomerServiceImp implements CustomerService  {
	
	@Autowired
	CustomerRepository CustRepo;
	
	@Override
	public Customer saveCustomer(Customer c) {
		
		return CustRepo.save(c) ;
	}

	@Override
	public List<Customer> addAllCustomer(List<Customer> c) {
	
		return CustRepo.saveAll(c);
	}

	
	
}
