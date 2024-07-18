package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Capacitaciones;

@Repository
public class CapacitacionesDAOImpl implements CapacitacionesDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Capacitaciones> findAll(){
	
	//
	Session session =sessionFactory.getCurrentSession();
	return session.createQuery("from Capacitaciones", Capacitaciones.class).getResultList();
	}
	
	@Override
	@Transactional
	public Capacitaciones findOne(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Capacitaciones.class, id);
		
	}
	@Override
	@Transactional
	public void add(Capacitaciones Capacitaciones) {
		Session session=sessionFactory.getCurrentSession(); //
		session.saveOrUpdate(Capacitaciones);
	}

	@Override
	@Transactional
	public void up(Capacitaciones Capacitaciones) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		
	}
}
