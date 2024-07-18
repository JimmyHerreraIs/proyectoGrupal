package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.hibernate.type.DateType;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CapacitacionesDAO;
import com.distribuida.entities.Capacitaciones;

public class PrincipalCapacitaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Patron de IoC o Inversión de Control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml"); 		
		CapacitacionesDAO CapacitacionesDAO = context.getBean("capacitacionesDAOImpl", CapacitacionesDAO.class);
		
		// CRUD : CREATE, READ UPDATE y DELETE
		// add
		Capacitaciones Capacitaciones = new Capacitaciones(3,"Seguridad Informatica",new Date(),new Date(),"Se informara de los peligro de la red");
		CapacitacionesDAO.up(Capacitaciones);
		CapacitacionesDAO.add(Capacitaciones);		
		// up
		//Capacitaciones Capacitaciones2 = new Capacitaciones(2,"Seguridad Informatica",new Date(),new Date(),"Se informara de los peligro de la red");
		//CapacitacionesDAO.up(Capacitaciones2);
		// del
		//CapacitacionesDAO.del(40);
		// findOne
		//System.out.println("**************** DEL *************"+CapacitacionesDAO.findOne(40));
		// findAll
		//List<Capacitaciones> Capacitacioness = CapacitacionesDAO.findAll(); 		
		//CapacitacionesDAO.findAll().forEach(item -> { System.out.println(item.toString()); });
		
		context.close();
		
	}

}
