package com.mongodb.repository;

import com.mongodb.model.Personas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<Personas, String> {
}
