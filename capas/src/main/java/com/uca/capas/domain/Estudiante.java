package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public",name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cUsuario;
	
	@Column(name="nombre")
	@Size(min=1,max = 50,message = "Este campo no puede tener mas de 50 caracteres")	
	@NotNull
	private String Nombre;
	
	@Column(name="apellido")
	@Size(min=1,max = 50,message = "Este campo no puede tener mas de 50 caracteres")
	@NotNull
	private String Apellido;
	
	@Column(name = "carne")
	@Size(min=1,max = 10,message = "Este campo no puede tener mas de 10 caracteres")
	@NotNull
	private String Carnet;
	
	@Column(name = "carrera")
	@Size(min=1,max = 100,message = "Este campo no puede tener mas de 100 caracteres")
	@NotNull
	private String Carrera;
	
	
	public Estudiante() {}
	
	public Integer getCUsuario() {
		return cUsuario;
	}

	public void setCUsuario(Integer cUsuario) {
		this.cUsuario = cUsuario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCarnet() {
		return Carnet;
	}

	public void setCarnet(String carnet) {
		Carnet = carnet;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}
	
	
}
