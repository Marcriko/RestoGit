package mx.edu.utez.resto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import mx.edu.utez.resto.document.PedidoEntity;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoEntity, String>{

}
