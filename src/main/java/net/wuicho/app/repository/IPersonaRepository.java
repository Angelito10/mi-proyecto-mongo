package net.wuicho.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.wuicho.app.entity.Persona;

public interface IPersonaRepository extends MongoRepository<Persona, String> {
	
}
