package com.subin.springboootmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.subin.springboootmongo.entity.Survey;
import com.subin.springboootmongo.service.MongoService;

@RestController
public class MongoController {
	
	@Autowired
	private MongoService mongoService;
	
	@RequestMapping("/surveys")
	public List<Survey> getData(){
		return mongoService.findAll();
		
	}
	
	@RequestMapping(value="/surveys", method=RequestMethod.POST)
	public void save(@RequestBody Survey survey){
		mongoService.save(survey);
	}
	
	@RequestMapping(value="/surveys", method=RequestMethod.PUT)
	public void update(@RequestBody Survey survey){
		mongoService.update(survey);
	}

}
