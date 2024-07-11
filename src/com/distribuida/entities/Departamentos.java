package com.distribuida.entities;

public class Departamentos {

	
	
	private int departamento_id;
	
	private int nombre;
	
	//Simulacion de inyeccion de dependencias
	

	public Departamentos() {}
	public Departamentos (int departamento_id,String nombre) {
		this.departamento_id= departamento_id;
		this.nombre=this.getNombre(); 
	}
	public int getDepartamento_id() {
		return departamento_id;
	}
	public void setDepartamento_id(int departamento_id) {
		this.departamento_id = departamento_id;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Departamentos [departamento_id=" + departamento_id + ", nombre=" + nombre + "]";
	}
	
	
		
}
