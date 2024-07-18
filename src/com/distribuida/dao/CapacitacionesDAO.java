package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Capacitaciones;

public interface CapacitacionesDAO {
	//	CRUD básico 
	public List<Capacitaciones> findAll();
	
	public Capacitaciones findOne(int id);
	
	public void add(Capacitaciones Capacitaciones);
	
	public void up(Capacitaciones Capacitaciones);
	
	public void del(int id);

	// CRUD avanzados
}
