package mx.edu.utez.resto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.resto.document.PlatilloEntity;

@Repository
public interface PlatilloRepository extends MongoRepository<PlatilloEntity, String>{

}
