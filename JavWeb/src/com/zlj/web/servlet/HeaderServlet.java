package com.zlj.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Servlet implementation class HeaderServlet
 */
@WebServlet("/servlet/HeaderServlet")
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
		String strDate = dateFormat.format(new Date());
		out.println("<table><br>");
		out.println("<td width=200><font size=3 color='green'>" + strDate + "</font></td>");
		out.println("<td width=200><font size=5 color='green'><center>ABC有限公司</center></font></td>");
		out.println("</tr></table>");
		out.println("<marquee><font size=3 color='red'>我们都是好孩子</font></marquee>");
		out.println("<hr>");
		
	}

}
