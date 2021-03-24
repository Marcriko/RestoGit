package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.utez.resto.document.PersonaEntity;
import mx.edu.utez.resto.repository.PersonaRepository;

@Service
@Transactional
public class PersonaService {
	@Autowired
	private PersonaRepository personaRepository;
	
	public List<PersonaEntity> personaEntities() {
		return personaRepository.findAll();
	}
	public boolean save(PersonaEntity personaEntity) {
		return personaRepository.existsById((long) personaRepository.save(personaEntity).getIdPersona());
	}
	public boolean delete(Long id) {
		personaRepository.deleteById(id);
		return !personaRepository.existsById(id);
	}
	
}
