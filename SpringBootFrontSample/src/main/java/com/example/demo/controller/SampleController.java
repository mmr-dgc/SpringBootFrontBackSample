package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SampleDto;
import com.example.demo.service.SampleService;


@RestController
public class SampleController {

	@Autowired
	SampleService service;
	
	@GetMapping("/")
	String index(HttpSession session) {
		Integer visitedCount = (Integer) session.getAttribute("visitedCount");
		visitedCount = visitedCount == null ? 1 : ++visitedCount;
        session.setAttribute("visitedCount", visitedCount);
        return "visitedCount:" + visitedCount;
	}
	
	@GetMapping("/api")
	SampleDto api() {
		SampleDto dto = service.getApiResponse();
		dto.setName("fromapi");
		return dto;	
	}
}
