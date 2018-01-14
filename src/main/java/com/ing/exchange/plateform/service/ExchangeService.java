package com.ing.exchange.plateform.service;

import java.util.List;

import com.ing.exchange.plateform.model.Orders;
import com.ing.exchange.plateform.model.OrdersRequest;

public interface ExchangeService {
	
	public Integer consumeOrder(OrdersRequest request);
	
	public List<Orders> retrieveOrders();
	
}
