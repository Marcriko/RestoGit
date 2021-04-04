package mx.edu.utez.resto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.resto.document.RolEntity;

@Repository
public interface RolRepository extends MongoRepository<RolEntity, String>{

}
