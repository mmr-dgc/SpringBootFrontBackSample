package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.SampleDto;


@Service
@Transactional
public class SampleService {
	
	@Autowired
    RestTemplate restTemplate;
	
	public SampleDto getApiResponse() {
		String URL = "https://[hogehoge]";
		return restTemplate.getForObject(URL, SampleDto.class);
	}
}
