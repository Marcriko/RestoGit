package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.utez.resto.document.IngredienteEntity;
import mx.edu.utez.resto.repository.IngredienteRepository;

@Service
@Transactional
public class IngredienteService {
	@Autowired
	private IngredienteRepository repository;
	
	public List<IngredienteEntity> ingredienteEntities() {
		return repository.findAll();
	}
	
	public boolean save(IngredienteEntity entity) {
		return repository.existsById((long) repository.save(entity).getIdIngrediente());
	}
	
	public boolean deleteById (Long id) {
		repository.deleteById(id);
		return !repository.existsById(id);
	}
}
