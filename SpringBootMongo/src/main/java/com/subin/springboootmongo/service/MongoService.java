package com.subin.springboootmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subin.springboootmongo.dao.MongoDao;
import com.subin.springboootmongo.entity.Survey;

@Service
public class MongoService {
	
	@Autowired
	private MongoDao mongoDao;
	
	public List<Survey> findAll(){
		return mongoDao.findAll();
	}

	public void save(Survey survey) {
		mongoDao.insert(survey);;
		
	}

	public void update(Survey survey) {
		mongoDao.save(survey);
		
	}

}
