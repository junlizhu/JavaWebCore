package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletRequest
 *
 */
@WebListener
public class ServletRequest implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public ServletRequest() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
    	System.out.println("** request 销毁。http://" 
                + arg0.getServletRequest().getRemoteAddr()
        		+ arg0.getServletContext().getContextPath());
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
        System.out.println("** request 初始化。http://" 
                + arg0.getServletRequest().getRemoteAddr()
        		+ arg0.getServletContext().getContextPath());
    }
	
}
