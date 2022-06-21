package com.example.rest.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.model.RestModel;

public interface RestRepository extends CrudRepository<RestModel, Integer>{
	
}
