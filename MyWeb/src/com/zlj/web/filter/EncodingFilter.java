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
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class EncodingFilter
 */
@WebFilter(
		dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, 
					 urlPatterns = { "/servlet/MyLoginServlet"}, 
		initParams = { 
				@WebInitParam(name = "charset", value = "UTF-8")
		}, 
		servletNames = { "MyLoginServlet" })
public class EncodingFilter implements Filter {
	private String charset;
    /**
     * Default constructor. 
     */
    public EncodingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("EncodingFilter 销毁...");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("EncodingFilter 正在执行....");
		request.setCharacterEncoding(this.charset);
		chain.doFilter(request, response);
		System.out.println("EncodingFilter 执行结束！");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("EncodingFilter 初始化...");
		this.charset = fConfig.getInitParameter("charset");
		System.out.println("EncodingFilter 初始化参数 charset:" + charset);
	}

}
