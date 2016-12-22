package com.zlj.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sun.management.HotspotThreadMBean;

/**
 * Servlet implementation class MyLoginServlet
 */
@WebServlet("/servlet/MyLoginServlet")
public class MyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		if (null != name && null != pwd && "aa".equals(name) && "12".equals(pwd)) {
			
		//	session.setAttribute("userid", name);
			
			ServletContext context = getServletContext();
			
			RequestDispatcher rd = context.getRequestDispatcher("/Login/welcome.jsp");
			rd.forward(request, response);
			//response.sendRedirect(request.getContextPath()+ "/Login/welcome.jsp");
		} else /*if(null != name || null != pwd || "aa".equals(name) || "12".equals(pwd) ){*/

			//ServletContext context1 = getServletContext();
			//RequestDispatcher rd = context1.getRequestDispatcher("/Login/loginFailed.jsp");
			//rd.include(request, response);
			
			response.sendRedirect(request.getContextPath()+ "/Login/loginFailed.jsp");
		}
	


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
