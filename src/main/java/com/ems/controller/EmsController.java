package com.ems.controller;


import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.EmsModel;
import com.ems.service.EmsService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class EmsController {
	
	@Autowired
	private EmsService service;
	
	@GetMapping({"/get/all"})
	public List<EmsModel> getAll()
	{
		return service.getAll();
	}
	
	@GetMapping("/get/{name}")
	public Optional<EmsModel> get(@PathVariable("name") String name) {
		return service.get(name);
	}
	
	@PostMapping("/add")
	public void add (@RequestBody EmsModel model) {
		service.add(model);
	}
	
	@PutMapping("/update")
	public void update (@RequestBody EmsModel model) {
		service.update(model);
	}
	
	@DeleteMapping("/delete/{name}")
	public void delete(@PathVariable("name") String name) {
		service.delete(name);
	}
	
	

}
