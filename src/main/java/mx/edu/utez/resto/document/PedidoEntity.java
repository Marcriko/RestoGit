package mx.edu.utez.resto.document;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
public class PedidoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idPedido;
	private List<PlatilloEntity> platillos;
	@NotBlank
	@NotNull
	private PersonaEntity cliente;
	@NotBlank
	@NotNull
	private Date fecha;
	private PromocionEntity promocion;
	private CuponEntity cupon;
	@NotBlank
	@NotNull
	private EstadoEntity estado;
	//
	public String getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}
	public List<PlatilloEntity> getPlatillos() {
		return platillos;
	}
	public void setPlatillos(List<PlatilloEntity> platillos) {
		this.platillos = platillos;
	}
	public PersonaEntity getCliente() {
		return cliente;
	}
	public void setCliente(PersonaEntity cliente) {
		this.cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public PromocionEntity getPromocion() {
		return promocion;
	}
	public void setPromocion(PromocionEntity promocion) {
		this.promocion = promocion;
	}
	public CuponEntity getCupon() {
		return cupon;
	}
	public void setCupon(CuponEntity cupon) {
		this.cupon = cupon;
	}
	public EstadoEntity getEstado() {
		return estado;
	}
	public void setEstado(EstadoEntity estado) {
		this.estado = estado;
	}
	
}
