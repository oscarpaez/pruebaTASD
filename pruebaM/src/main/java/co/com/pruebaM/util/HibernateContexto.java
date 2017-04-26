package co.com.pruebaM.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateContexto implements ServletContextListener{

	//@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		HibernateUtil.getSessionfactory().close();
		
		
	}

	//@Override
	public void contextInitialized(ServletContextEvent evento) {
		HibernateUtil.getSessionfactory(); 
		
	}
}
