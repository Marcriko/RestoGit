package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.utez.resto.document.CuponEntity;
import mx.edu.utez.resto.repository.CuponRepository;

@Service
@Transactional
public class CuponService {

	@Autowired
	private CuponRepository cuponRepository;
	
	public List<CuponEntity> getCuponEntities(){
		return cuponRepository.findAll();
	}
	
	public boolean save(CuponEntity cuponEntity) {
		return cuponRepository.existsById((String) cuponRepository.save(cuponEntity).getIdCupon());
	}
	
	public boolean delete(String id) {
		cuponRepository.deleteById(id);
		return !cuponRepository.existsById(id);
	}
	
}
