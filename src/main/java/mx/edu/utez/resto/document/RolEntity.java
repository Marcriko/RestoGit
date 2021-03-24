package mx.edu.utez.resto.document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity

public class RolEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idRol;
	@NotBlank
	@NotNull
	private String role;
	//
	public String getIdRol() {
		return idRol;
	}
	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}