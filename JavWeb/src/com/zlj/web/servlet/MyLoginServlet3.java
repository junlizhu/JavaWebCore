package com.zlj.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyLoginServlet2
 */
//@WebServlet("/servlet/MyLoginServlet3")
public class MyLoginServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyLoginServlet3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setCharacterEncoding("GB2312");
		//response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=GB2312");

		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>用servlet调试get/post方法</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H2>调用了DoGet方法</H2><p>");
		out.println("<H2>用户输入信息如下</H2>");
		//request.setCharacterEncoding("UTF-8"); 
		String username = request.getParameter("username");
		username = new String(username.getBytes("ISO8859-1"),"UTF-8");
		if (username == null || username == "") {
			username = "未输入";
		}
		String userpwd = request.getParameter("password");
		userpwd = new String(userpwd.getBytes("ISO8859-1"),"UTF-8");
		if (userpwd == null || userpwd == "") {
			userpwd = "未输入";
		}
		out.println("<H2>用户名:" + username + "</H2>");
		out.println("<H2>密码:" + userpwd + "</H2>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
