package com.ing.exchange.plateform.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class OrdersResponse {

	@JsonProperty("statusCode")
	private Integer code;
	
	@JsonProperty("statusMessage")
	private String message;

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
