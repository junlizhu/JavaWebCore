package com.zlj.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreadSafe
 */
@WebServlet("/servlet/ThreadSafe")
public class ThreadSafe extends HttpServlet {
	//String name=""; //实例变量，多线程共享
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreadSafe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected synchronized void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {*/
    //同步代码快使用synchronized关键字
		protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		//response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>servlet线程安全问题</title></head>");
		out.println("<body>");
		//request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		 String name = new String(username.getBytes("iso8859-1"),"UTF-8");//解决线程安全，第二种方式，设置局部变量  必须把全局变量变为局部变量
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<h3>您好," + name + "!</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
