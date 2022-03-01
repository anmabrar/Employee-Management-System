package com.ems.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.model.EmsModel;
import com.ems.repository.EmsRepository;

@Service
public class EmsService {
	@Autowired
	private EmsRepository repository;
	
	public List<EmsModel> getAll(){
		List<EmsModel> models = new ArrayList<EmsModel>();
		repository.findAll().forEach(models::add);
		return models;
	}
	
	public Optional<EmsModel> get(String name){
		return repository.findById(name);
	}
	
	public void add (EmsModel model) {
		repository.save(model);
	}
	
	public void update (EmsModel model) {
		repository.save(model);
	}
	
	public void delete (String name) {
		repository.deleteById(name);
	}
	

}
