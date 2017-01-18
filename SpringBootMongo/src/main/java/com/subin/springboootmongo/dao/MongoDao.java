package com.subin.springboootmongo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.subin.springboootmongo.entity.Survey;

@Repository
public interface MongoDao extends MongoRepository<Survey, String>{
	
	public List<Survey> findAll();
	public Survey insert(Survey survey); 

}
