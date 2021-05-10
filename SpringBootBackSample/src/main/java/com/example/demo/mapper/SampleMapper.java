package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.example.demo.entity.SampleEntity;

@Mapper
@Component
public interface SampleMapper {
	
	@Select("SELECT id, name FROM mybook WHERE id = #{id}")
    SampleEntity select(int id);

}
