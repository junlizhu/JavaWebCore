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

import com.sun.java.swing.plaf.windows.resources.windows_zh_TW;

import sun.awt.windows.WWindowPeer;

/**
 * Servlet implementation class ABC
 */
@WebServlet("/servlet/ABC")
public class ABC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ABC() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");// 设置文档类型及字符集
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ABC公司主页</title>");
		out.println("</head>");
		out.println("<body>");
		ServletContext context = getServletContext();

		RequestDispatcher rd = context.getRequestDispatcher("/servlet/HeaderServlet");
		//rd.include(request, response);
		rd.forward(request, response);

		out.println("<font size=4 color=red>");
		out.println("我们是新安的人才，<br><br>");
		out.println("我们是新安的人才，<br><br>");
		out.println("我们是新安的人才 <a href='www.baidu.com'>ABC设计</a></font>，<br><br>");
		rd = context.getRequestDispatcher("/servlet/Footer.html");
		//rd.include(request, response);
	    rd.forward(request, response);

		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}
