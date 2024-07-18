package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "Departamentos")
public class Departamentos {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_departamentos")
	private int idDepartamentos;
	@Column(name="nombre")
	private int nombre;
	
	//Simulacion de inyeccion de dependencias
	

	public Departamentos() {}
	public Departamentos (int departamento_id,String nombre) {
		this.idDepartamentos= idDepartamentos;
		this.nombre=this.getNombre(); 
	}
	public int getDepartamento_id() {
		return idDepartamentos;
	}
	public void setDepartamento_id(int idDepartamentos) {
		this.idDepartamentos = idDepartamentos;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Departamentos [departamento_id=" + idDepartamentos + ", nombre=" + nombre + "]";
	}
	
	
		
}
