package com.number1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Servlet1 extends HttpServlet {

	
	void print(String content){
		System.out.println(getClass().getSimpleName()+" method name:"+content+" thread name: "+Thread.currentThread().getName());
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		print("service");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		print("destory");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		print("init");
	}
	
	

}
