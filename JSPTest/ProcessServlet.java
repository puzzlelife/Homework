package com.number3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//req.setCharacterEncoding("UTF-8");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		rep.setHeader("Content-Type", "text/html;charset=UTF-8");
		rep.getWriter().write("name:"+name+" age:"+age);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		rep.setHeader("Content-Type", "text/html;charset=UTF-8");
		rep.getWriter().write("name:"+name+" age:"+age);
	}

	
	
	
	
}
