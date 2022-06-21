package com.example.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.model.RestModel;
import com.example.rest.repository.RestRepository;

@Service
public class RestService {
	@Autowired
	private RestRepository restRepository;
	
	public RestModel addBlMethod(RestModel restModel) {
		return restRepository.save(restModel);
	}
	
	public Iterable<RestModel> findAll() {
		return restRepository.findAll();
		
	}
	
	public RestModel findById(Integer id) {
		return restRepository.findById(id).get();
	}
	
	public void delete(RestModel restModel) {
		restRepository.delete(restModel);
	}
}
