package com.distribuida.principal;

import java.util.List;



import com.distribuida.dao.CapacitacionesDAO;
import com.distribuida.entities.Capacitaciones;

public class PrincipalCapacitaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Patron de IoC o Inversión de Control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 		
		CapacitacionesDAO CapacitacionesDAO = context.getBean("CapacitacionesDAOImpl2", CapacitacionesDAO.class);
		
		// CRUD : CREATE, READ UPDATE y DELETE
		// add
		Capacitaciones Capacitaciones = new Capacitaciones(2,"Habilidades Blandas","24","30");
		//CapacitacionesDAO.add(Capacitaciones);		
		// up
		Capacitaciones Capacitaciones2 = new Capacitaciones(2,"Seguridad Informatica","1","5");
		CapacitacionesDAO.up(Capacitaciones2);
		// del
		//CapacitacionesDAO.del(40);
		// findOne
		System.out.println("**************** DEL *************"+CapacitacionesDAO.findOne(40));
		// findAll
		//List<Capacitaciones> Capacitacioness = CapacitacionesDAO.findAll(); 		
		CapacitacionesDAO.findAll().forEach(item -> { System.out.println(item.toString()); });
		
		context.close();
		
	}

}
