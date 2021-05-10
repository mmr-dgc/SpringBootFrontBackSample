package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SampleEntity;
import com.example.demo.service.SampleService;


@RestController
public class SampleController {

	@Autowired
	SampleService service;
	
	@GetMapping("/api")
	SampleEntity cloudsql() {
		return service.select(1);
	}
}
