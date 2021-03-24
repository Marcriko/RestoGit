package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.utez.resto.document.EstadoEntity;
import mx.edu.utez.resto.repository.EstadoRepository;

@Service
@Transactional
public class EstadoService {
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<EstadoEntity> estadoEntities(){
		return estadoRepository.findAll();
	}
	
	public boolean saveEstado(EstadoEntity entity) {
		return estadoRepository.existsById((long) estadoRepository.save(entity).getIdEstado());
	}
	
	public boolean deleteEstado(Long id) {
		estadoRepository.deleteById(id);
		return !estadoRepository.existsById(id);
	}
}
