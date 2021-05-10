package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SampleEntity;
import com.example.demo.mapper.SampleMapper;

@Repository
public class SampleRepository {
	
	@Autowired
	private SampleMapper mapper;

	public SampleEntity select(int id) {
		return mapper.select(id);
	}
}
