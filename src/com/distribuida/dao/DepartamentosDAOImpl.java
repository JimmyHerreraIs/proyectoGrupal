package com.distribuida.dao;

import java.util.List;

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
	public void add(Departamentos departamentos) {
		Session session=sessionFactory.getCurrentSession(); //
		session.SaveOrUpdate(departamentos);
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


