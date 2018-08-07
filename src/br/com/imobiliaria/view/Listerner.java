package br.com.imobiliaria.view;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class Listerner implements ServletContextListener {
	

	@Override
	public void contextInitialized(ServletContextEvent arg) {
		System.out.println("contextInitialized....");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg) {
		System.out.println("contextDestroyed....");
	}

}
