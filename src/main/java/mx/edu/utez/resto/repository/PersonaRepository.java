package mx.edu.utez.resto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.resto.document.PersonaEntity;

@Repository
public interface PersonaRepository extends MongoRepository<PersonaEntity, String>{
	PersonaEntity findByUsername(String username);
}
