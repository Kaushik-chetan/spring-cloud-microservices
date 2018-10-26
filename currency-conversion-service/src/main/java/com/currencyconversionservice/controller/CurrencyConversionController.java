package com.currencyconversionservice.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currencyconversionservice.bean.CurrencyConversionBean;
import com.currencyconversionservice.client.CurrencyExcahngeServiceClient;

@RestController
public class CurrencyConversionController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CurrencyExcahngeServiceClient currencyExcahngeServiceClient;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		// With Rest Template

		/*
		 * Map<String, String> uriVariables = new HashMap<>();
		 * 
		 * uriVariables.put("from", from);
		 * 
		 * uriVariables.put("to", to);
		 * 
		 * ResponseEntity<CurrencyConversionBean> responseEntity = new
		 * RestTemplate().getForEntity(
		 * "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
		 * CurrencyConversionBean.class, uriVariables);
		 * 
		 * CurrencyConversionBean response = responseEntity.getBody();
		 */

		// With Speing cloud Feign Client

		CurrencyConversionBean response = currencyExcahngeServiceClient.getExchangeValue(from, to);
		
		logger.info("{}", response);

		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());

	}

}
