package mx.edu.utez.resto.document;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PlatilloEntity {
	@Id
	private String idPlatillo;
	@NotBlank
	@NotNull
	private String nombre;
	@NotBlank
	@NotNull
	private String descripcion;
	@NotBlank
	@NotNull
	private Double precio;
	private List<IngredienteEntity> ingredientes;
	//
	public String getIdPlatillo() {
		return idPlatillo;
	}
	public void setIdPlatillo(String idPlatillo) {
		this.idPlatillo = idPlatillo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public List<IngredienteEntity> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<IngredienteEntity> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
}
