package mx.edu.utez.resto.document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class IngredienteEntity {
	@Id
	private String idIngrediente;
	@NotBlank
	@NotNull
	private String nombre;
	//
	public String getIdIngrediente() {
		return idIngrediente;
	}
	public void setIdIngrediente(String idIngrediente) {
		this.idIngrediente = idIngrediente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
