package com.distribuida.dao;

import java.util.List;

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
	public void add(Capacitaciones Capacitaciones) {
		Session session=sessionFactory.getCurrentSession(); //
		session.SaveOrUpdate(Capacitaciones);
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
