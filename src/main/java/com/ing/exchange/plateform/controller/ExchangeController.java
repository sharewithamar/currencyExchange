package com.ing.exchange.plateform.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ing.exchange.plateform.model.OrdersRequest;
import com.ing.exchange.plateform.model.OrdersResponse;


@RestController
@RequestMapping("/exchange")
public class ExchangeController {
	
	/**
	 * This method will consume orders.
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/consume")
	public ResponseEntity<OrdersResponse> consumeOrder(@ModelAttribute(name="orderRequest") OrdersRequest request) {
		OrdersResponse response = new OrdersResponse();
		return new ResponseEntity<>(null ,HttpStatus.valueOf(response.getCode()));
	}
	
	/**
	 * This method will return orders response containing list of orders.
	 * @return
	 */
	@RequestMapping(value="/retrieve")
	public ResponseEntity<OrdersResponse> retrieveOrders() {
		OrdersResponse response = new OrdersResponse();
		return new ResponseEntity<>(null ,HttpStatus.valueOf(response.getCode()));
	}
}
