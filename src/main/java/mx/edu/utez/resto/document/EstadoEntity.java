package mx.edu.utez.resto.document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
public class EstadoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstado;
	@NotBlank
	@NotNull
	private String estado;
	//
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
