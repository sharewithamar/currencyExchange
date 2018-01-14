package com.ing.exchange.plateform.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class ExchangeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transactionId")
    private Integer id;
	
	@Column(name = "userId")
    private String user;
	
	@Column(name = "fromCurrency")
    private String from;
	
	@Column(name = "toCurrency")
    private String to;
	
	@Column(name = "sell")
    private Integer sellAmount;
	
	@Column(name = "buy")
    private float buyAmount;
	
	@Column(name = "rate")
    private float rateAmount;
	
	@Column(name = "fee")
    private String feeAmount;
	
	@Column(name = "country")
    private String originCountry;
	
	@Column(name = "timeProcess")
    private Date processTime;
	
	@Column(name = "timePlaced")
    private Date placedTime;
	
	@Column(name = "status")
    private String transactionStatus;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

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
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
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
	 * @return the feeAmount
	 */
	public String getFeeAmount() {
		return feeAmount;
	}

	/**
	 * @param feeAmount the feeAmount to set
	 */
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
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
	 * @return the processTime
	 */
	public Date getProcessTime() {
		return processTime;
	}

	/**
	 * @param processTime the processTime to set
	 */
	public void setProcessTime(Date processTime) {
		this.processTime = processTime;
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

	/**
	 * @return the transactionStatus
	 */
	public String getTransactionStatus() {
		return transactionStatus;
	}

	/**
	 * @param transactionStatus the transactionStatus to set
	 */
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExchangeEntity [id=" + id + ", user=" + user + ", from=" + from + ", to=" + to + ", sellAmount="
				+ sellAmount + ", buyAmount=" + buyAmount + ", rateAmount=" + rateAmount + ", feeAmount=" + feeAmount
				+ ", originCountry=" + originCountry + ", processTime=" + processTime + ", placedTime=" + placedTime
				+ ", transactionStatus=" + transactionStatus + "]";
	}

	
}
