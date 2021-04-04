package mx.edu.utez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.edu.utez.resto.document.PedidoEntity;
import mx.edu.utez.resto.repository.PedidoRepository;

@Service
@Transactional
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public List<PedidoEntity> pedidoEntities() {
		return pedidoRepository.findAll();
	}
	
	public boolean save(PedidoEntity pedidoEntity) {
		return pedidoRepository.existsById((String) pedidoRepository.save(pedidoEntity).getIdPedido());
	}
	
	public boolean delete(String id) {
		pedidoRepository.deleteById(id);
		return !pedidoRepository.existsById(id);
	}
}
