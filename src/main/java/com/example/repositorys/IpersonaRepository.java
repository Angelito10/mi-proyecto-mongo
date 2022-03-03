package com.example.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Persona;

public interface IpersonaRepository extends MongoRepository<Persona, String> {

	
	
}
