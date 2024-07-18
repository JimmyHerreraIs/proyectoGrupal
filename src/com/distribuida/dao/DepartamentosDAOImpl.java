package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Departamentos;

@Repository
public class DepartamentosDAOImpl implements DepartamentosDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Departamentos> findAll(){
	
	//
	Session session =sessionFactory.getCurrentSession();
	return session.createQuery("from Departamentos", Departamentos.class).getResultList();
	}
	
	@Override
	@Transactional
	public Departamentos findOne(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Departamentos.class, id);
		
	}
	@Override
	@Transactional
	public void add(Departamentos departamentos) {
		Session session=sessionFactory.getCurrentSession(); //
		session.saveOrUpdate(departamentos);
	}

	@Override
	@Transactional
	public void up(Departamentos Departamentos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void del(int id) {
		// TODO Auto-generated method stub
		
	}
}


