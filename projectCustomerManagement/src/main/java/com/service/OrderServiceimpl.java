package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderRepository;
import com.model.Order;
@Service
public class OrderServiceimpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepo;
	
	@Override
	public Order saveOrder(Order o) {
		
		return orderRepo.save(o) ;
	}

}
