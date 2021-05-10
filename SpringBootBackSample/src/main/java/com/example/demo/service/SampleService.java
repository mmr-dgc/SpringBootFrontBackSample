package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.SampleEntity;
import com.example.demo.repository.SampleRepository;

@Service
@Transactional
public class SampleService {

	@Autowired
	SampleRepository repository;
	
	public SampleEntity select(int id) {
		return repository.select(id);
	}
}
