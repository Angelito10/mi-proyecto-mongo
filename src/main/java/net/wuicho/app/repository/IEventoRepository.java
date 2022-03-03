package net.wuicho.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.wuicho.app.entity.Evento;

public interface IEventoRepository extends MongoRepository<Evento, String>{

}
