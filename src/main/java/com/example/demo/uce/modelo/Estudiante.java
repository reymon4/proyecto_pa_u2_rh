package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Para la representación en la BD
@Entity
@Table(name = "estudiante")
public class Estudiante {
	
	//Mapeamos la columnas de la tabla como atributos.
	//Con las clases, no con los primitivos.
	
	@Id //Esta anotación es para definir la clave primaria
	@Column (name="estu_id")
	private Integer id;
	
	@Column (name="estu_nombre")
	private String nombre;
	
	@Column (name="estu_apellido")
	private String apellido;
	
	@Column (name="estu_genero")
	private String genero;
	
	@Column (name="estu_cedula")
	private String cedula;
	
	@Column (name="estu_ciudad")
	private String ciudad;
	
	
	
	//Getters and Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	

}
