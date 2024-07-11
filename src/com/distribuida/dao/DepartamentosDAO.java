package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Departamentos;

public interface DepartamentosDAO {
	//	CRUD básico 
	public List<Departamentos> findAll();
	
	public Departamentos findOne(int id);
	
	public void add(Departamentos departamentos);
	
	public void up(Departamentos departamentos);
	
	public void del(int id);

	// CRUD avanzados
}
