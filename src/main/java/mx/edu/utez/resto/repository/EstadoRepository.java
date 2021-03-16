package mx.edu.utez.resto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.resto.document.EstadoEntity;

@Repository
public interface EstadoRepository extends MongoRepository<EstadoEntity, String>{

}
