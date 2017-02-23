package com.number3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UploadServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String file=req.getParameter("file");
		rep.setContentType("text/html;charset=utf-8");
		rep.getWriter().write("name:"+name+"<br>age:"+age+"<br>file:"+file);
	}
	
}
