package mx.edu.utez.resto.document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
public class PersonaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idPersona;
	@NotBlank
	@NotNull
	private String nombre;
	@NotBlank
	@NotNull
	private String apellidoPaterno;
	@NotBlank
	@NotNull
	private String apellidoMaterno;
	@NotBlank
	@NotNull
	private String correo;
	@NotBlank
	@NotNull
	private String direccion;
	@NotBlank
	@NotNull
	private String username;
	@NotBlank
	@NotNull
	private String password;
	private RolEntity role;
	//
	public String getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public RolEntity getRole() {
		return role;
	}
	public void setRole(RolEntity role) {
		this.role = role;
	}
	
	
}
