package com.number2;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class WebContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent e) {
		// TODO Auto-generated method stub
		System.out.println("listener method: contextDestoryed");
	}

	@Override
	public void contextInitialized(ServletContextEvent e) {
		// TODO Auto-generated method stub
		System.out.println("listener method: init");
	}

}
