package listener;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextListenter
 *
 */
@WebListener
public class ServletContextListenter implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletContextListenter() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("** 监听器销毁中 -->" + arg0.getServletContext().getContextPath());
         
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("** 监听器初始化中 -->" + arg0.getServletContext().getContextPath());
    }
	
}
