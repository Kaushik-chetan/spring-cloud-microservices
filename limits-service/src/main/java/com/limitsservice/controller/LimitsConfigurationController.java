package com.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limitsservice.bean.LimitsConfiguration;
import com.limitsservice.config.Configuration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration Configuration;
	
	@GetMapping("/limits")
	public LimitsConfiguration getLimitConfiguration()
	{
		return new LimitsConfiguration(Configuration.getMinimum(), Configuration.getMaximum());
	}
	
	
	

}
