package com.ing.exchange.plateform.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class Orders {

	
	@JsonProperty("userId")
	private String user;
	
	@JsonProperty("from")
	private String fromCurrency;

	@JsonProperty("to")
	private String toCurrency;
	
	@JsonProperty("sell")
	private Integer sellAmount;
	
	@JsonProperty("buy")
	private float buyAmount;
	
	@JsonProperty("rate")
	private float rateAmount;
	
	@JsonProperty("fee")
	private String totalFee;
	
	@JsonProperty("country")
	private String originCountry;
	
	@JsonProperty("time")
	private Date processedTime;

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
	 * @return the buyAmount
	 */
	public float getBuyAmount() {
		return buyAmount;
	}

	/**
	 * @param buyAmount the buyAmount to set
	 */
	public void setBuyAmount(float buyAmount) {
		this.buyAmount = buyAmount;
	}

	/**
	 * @return the rateAmount
	 */
	public float getRateAmount() {
		return rateAmount;
	}

	/**
	 * @param rateAmount the rateAmount to set
	 */
	public void setRateAmount(float rateAmount) {
		this.rateAmount = rateAmount;
	}

	/**
	 * @return the totalFee
	 */
	public String getTotalFee() {
		return totalFee;
	}

	/**
	 * @param totalFee the totalFee to set
	 */
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

	/**
	 * @return the originCountry
	 */
	public String getOriginCountry() {
		return originCountry;
	}

	/**
	 * @param originCountry the originCountry to set
	 */
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	/**
	 * @return the processedTime
	 */
	public Date getProcessedTime() {
		return processedTime;
	}

	/**
	 * @param processedTime the processedTime to set
	 */
	public void setProcessedTime(Date processedTime) {
		this.processedTime = processedTime;
	}
	
	
	
}
