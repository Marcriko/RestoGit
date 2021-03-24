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
public class CuponEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idCupon;
	@NotBlank
	@NotNull
	private Date fechaInicio;
	@NotBlank
	@NotNull
	private Date fechaFin;
	@NotBlank
	@NotNull
	private Double descuento;
	@NotBlank
	@NotNull
	private List<PlatilloEntity> platillos;
	@NotBlank
	@NotNull
	private Integer limiteUsos;
	//
	public String getIdCupon() {
		return idCupon;
	}
	public void setIdCupon(String idCupon) {
		this.idCupon = idCupon;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Double getDescuento() {
		return descuento;
	}
	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	public List<PlatilloEntity> getPlatillos() {
		return platillos;
	}
	public void setPlatillos(List<PlatilloEntity> platillos) {
		this.platillos = platillos;
	}
	public Integer getLimiteUsos() {
		return limiteUsos;
	}
	public void setLimiteUsos(Integer limiteUsos) {
		this.limiteUsos = limiteUsos;
	}
	
}
