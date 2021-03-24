package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.utez.resto.document.PlatilloEntity;
import mx.edu.utez.resto.repository.PlatilloRepository;

@Service
 @Transactional
public class PlatilloService {
	@Autowired
	private PlatilloRepository platilloRepository;
	
	public List<PlatilloEntity> platilloEntities() {
		return platilloRepository.findAll();
	}
	
	public boolean save(PlatilloEntity platilloEntity) {
		return platilloRepository.existsById((long) platilloRepository.save(platilloEntity).getIdPlatillo());
	}
	
	public boolean delete(Long id) {
		platilloRepository.deleteById(id);
		return !platilloRepository.existsById(id);
	}
}
