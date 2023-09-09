package com.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Order;
import com.service.OrderService;

@RestController

public class OrderController {
	
	@Autowired
	OrderService  orderService;
	
	@PostMapping("/saveorder")
	public Order saveOrder(@RequestBody Order o) {
		
		return orderService.saveOrder(o);
	}
}
