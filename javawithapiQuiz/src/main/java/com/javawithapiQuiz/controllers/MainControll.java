package com.javawithapiQuiz.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


import com.javawithapiQuiz.Services.DataServiceInterfaces;
import com.javawithapiQuiz.Models.*;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class MainControll {
	@Autowired
	DataServiceInterfaces DataService;
	
	@RequestMapping("/tes")
	private String tes() {
		return "Hello World";
	}
	
	@PostMapping("/postData")
	private int post(@RequestBody DataModel m)
	{	
		//m.getModeljk().getId();
		System.out.println(m);
		return DataService.create(m);
	
	}
	
	@GetMapping("/get10Data")
	private List<DataModel> cariMahasiswa(){
		return DataService.cariMhs();
	}
	
	@GetMapping("/getData/{data_skills}")
	private DataModel cariSkill(@PathVariable String data_skills){
		return DataService.carimhs_skill(data_skills);
	}
	
}
