package com.zlj.web.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

/**
 * Servlet implementation class initServletDemo2
 */
//@WebServlet("/servlet/initServletDemo2")
public class initServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public initServletDemo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see ServletDemo1#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("institute :" + config.getInitParameter("institute"));
	}

	/**
	 * @see ServletDemo1#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
