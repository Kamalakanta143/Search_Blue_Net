package com.search_marketing_app17.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.search_marketing_app17.dto.Lead;

@Component
public class RestClient {
	
	public Lead getOneLeadById(Long id) {
		 RestTemplate restTemplate = new RestTemplate();
		 Lead lead = restTemplate.getForObject("http://localhost:8080/getapi/"+id, Lead.class);
		 return lead;
	
	}

}
