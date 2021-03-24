package mx.edu.utez.resto.document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity

public class IngredienteEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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