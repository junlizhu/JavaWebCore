package com.zlj.web.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class PasswordFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, servletNames = { "/JavWeb/servlet/MyLoginServlet2"})
public class PasswordFilter2 implements Filter {

    /**
     * Default constructor. 
     */
    public PasswordFilter2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("过滤器PasswordFilter销毁中........");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("过滤器PasswordFilter执行中........");
		String password = request.getParameter("password");
		if (password !=null && "".equals(password)) {
		System.out.println("PasswordFilter放行，即将进入下一个过滤器....");
			chain.doFilter(request, response);
			//System.out.println("过滤器UserNmaeFilter执行结束！");
		} else {
			HttpServletResponse hr = (HttpServletResponse)response;
			hr.sendRedirect("/filter/loginPasswordLost.html");
		}
		// pass the request along the filter chain
		System.out.println("过滤器PasswordFilter执行结束！");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("过滤器PasswordFilter初始化中........");
	}

}
