package com.distribuida.entities;

import java.util.Date;
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
	private Date fecha_inicio;
	@Column(name="fecha_fin")
	private Date fecha_fin;
	@Column(name="descripcion")
	private String descripcion;
	

	public Capacitaciones() {}

	public Capacitaciones(int idCapacitaciones, String nombre, Date fecha_inicio, Date fecha_fin,String descripcion) {

		this.idCapacitaciones = idCapacitaciones;
		this.nombre = nombre;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.descripcion=descripcion;
		
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
	

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Capacitaciones [idCapacitaciones=" + idCapacitaciones + ", nombre=" + nombre + ", fecha_inicio="
				+ fecha_inicio + ", fecha_fin=" + fecha_fin + ", descripcion=" + descripcion + "]";
	}

	




}
