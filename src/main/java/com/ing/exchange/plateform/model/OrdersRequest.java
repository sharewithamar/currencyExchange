package com.ing.exchange.plateform.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class OrdersRequest {

	@JsonProperty("userId")
	private String user;
	
	@JsonProperty("from")
	private String fromCurrency;

	@JsonProperty("to")
	private String toCurrency;
	
	@JsonProperty("toSell")
	private Integer sellAmount;
	
	@JsonProperty("timePlaced")
	private Date placedTime;
	
	@JsonProperty("originCountry")
	private String countryOriginFrom;
	
	

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the fromCurrency
	 */
	public String getFromCurrency() {
		return fromCurrency;
	}

	/**
	 * @param fromCurrency the fromCurrency to set
	 */
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	/**
	 * @return the toCurrency
	 */
	public String getToCurrency() {
		return toCurrency;
	}

	/**
	 * @param toCurrency the toCurrency to set
	 */
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	/**
	 * @return the sellAmount
	 */
	public Integer getSellAmount() {
		return sellAmount;
	}

	/**
	 * @param sellAmount the sellAmount to set
	 */
	public void setSellAmount(Integer sellAmount) {
		this.sellAmount = sellAmount;
	}

	

	/**
	 * @return the countryOriginFrom
	 */
	public String getCountryOriginFrom() {
		return countryOriginFrom;
	}

	/**
	 * @param countryOriginFrom the countryOriginFrom to set
	 */
	public void setCountryOriginFrom(String countryOriginFrom) {
		this.countryOriginFrom = countryOriginFrom;
	}

	/**
	 * @return the placedTime
	 */
	public Date getPlacedTime() {
		return placedTime;
	}

	/**
	 * @param placedTime the placedTime to set
	 */
	public void setPlacedTime(Date placedTime) {
		this.placedTime = placedTime;
	}
	
}
