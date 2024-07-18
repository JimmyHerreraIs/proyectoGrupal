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
@Table(name = "Capacitaciones")
public class Capacitaciones {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_capacitaciones")
	private int idCapacitaciones;
	@Column(name="nombre")
	private String nombre;
	@Column(name="fecha_inicio")
	private String fecha_inicio;
	@Column(name="fecha_fin")
	private String fecha_fin;
	

	public Capacitaciones() {}

	public Capacitaciones(int idCapacitaciones, String nombre, String fecha_inicio, String fecha_fin) {

		this.idCapacitaciones = idCapacitaciones;
		this.nombre = nombre;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		
	}

	public int getIdCapacitaciones() {
		return idCapacitaciones;
	}

	public void setIdCapacitaciones(int idCapacitaciones) {
		this.idCapacitaciones = idCapacitaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Capacitaciones [idCapacitaciones=" + idCapacitaciones + ", nombre=" + nombre + ", fecha_inicio="
				+ fecha_inicio + ", fecha_fin=" + fecha_fin + "]";
	}

	




}
