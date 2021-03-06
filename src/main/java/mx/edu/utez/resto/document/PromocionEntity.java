package mx.edu.utez.resto.document;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Table(name = "promocion")
public class PromocionEntity {
	@Id
	private int idPromocion;
	@NotBlank
	@NotNull
	private String descripcion;
	@NotBlank
	@NotNull
	private Integer limitePromociones;
	@NotBlank
	@NotNull
	private Date fechaInicio;
	@NotBlank
	@NotNull
	private Date fechaFin;
	@NotBlank
	@NotNull
	@ManyToMany
	private List<PlatilloEntity> platillos;
	@NotBlank
	@NotNull
	private Double precioPromocion;
	//
	public int getIdPromocion() {
		return idPromocion;
	}
	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getLimitePromociones() {
		return limitePromociones;
	}
	public void setLimitePromociones(Integer limitePromociones) {
		this.limitePromociones = limitePromociones;
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
	public List<PlatilloEntity> getPlatillos() {
		return platillos;
	}
	public void setPlatillos(List<PlatilloEntity> platillos) {
		this.platillos = platillos;
	}
	public Double getPrecioPromocion() {
		return precioPromocion;
	}
	public void setPrecioPromocion(Double precioPromocion) {
		this.precioPromocion = precioPromocion;
	}
	
}
