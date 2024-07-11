package com.distribuida.principal;

import java.util.List;



import com.distribuida.dao.DepartamentosDAO;
import com.distribuida.entities.Departamentos;

public class PrincipalDepartamentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Patron de IoC o Inversión de Control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 		
		DepartamentosDAO DepartamentosDAO = context.getBean("DepartamentosDAOImpl2", DepartamentosDAO.class);
		
		// CRUD : CREATE, READ UPDATE y DELETE
		// add
		Departamentos Departamentos = new Departamentos(1,"Marketing");
		//DepartamentosDAO.add(Departamentos);		
		// up
		Departamentos Departamentos2 = new Departamentos(2,"RRHH");
		DepartamentosDAO.up(Departamentos2);
		// del
		//DepartamentosDAO.del(40);
		// findOne
		System.out.println("**************** DEL *************"+DepartamentosDAO.findOne(40));
		// findAll
		//List<Departamentos> Departamentoss = DepartamentosDAO.findAll(); 		
		DepartamentosDAO.findAll().forEach(item -> { System.out.println(item.toString()); });
		
		context.close();
		
	}

}
