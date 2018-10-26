package com.currencyexchangeservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class ExchangeValue {

	@Id
	private int id;
    
	@Column(name = "currency_from")
	private String from;
    
	@Column(name = "currency_to")
	private String to;

	private Double conversionMultiple;
	
	@Transient
	private int port;

	public ExchangeValue() {

	}

	public ExchangeValue(int id, String from, String to, Double conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Double getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(Double conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
