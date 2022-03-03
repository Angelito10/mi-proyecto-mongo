package com.example.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Evento;

public interface IeventoRepository extends MongoRepository<Evento, String>{

}
