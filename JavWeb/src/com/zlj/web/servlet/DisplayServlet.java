package com.zlj.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/servlet/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1 = (String) request.getAttribute("formRequest");
		HttpSession session = request.getSession();
		String str2 = (String)session.getAttribute("formSession");
		ServletContext context = getServletConfig().getServletContext();
		String str3 = (String) context.getAttribute("formContext");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>输出范围属性的有关信息</HEAD></TITLE>");
		out.println("<BODY>");
		out.println("<H3>request值:" + str1 + "</H3>");
		out.println("<H3>session值:" + str2 + "</H3>");
		out.println("<H3>application值:" + str3 + "</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}

}
