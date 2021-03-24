package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.utez.resto.document.RolEntity;
import mx.edu.utez.resto.repository.RolRepository;

@Service
@Transactional
public class RolService {
	@Autowired
	private RolRepository rolRepository;
	
	public List<RolEntity> rolEntities() {
		return rolRepository.findAll();
	}
	
	public boolean save(RolEntity rol) {
		return rolRepository.existsById((long) rolRepository.save(rol).getIdRol());
	}
	
	public boolean delete (Long id) {
		rolRepository.deleteById(id);
		return rolRepository.existsById(id);
	}

}
