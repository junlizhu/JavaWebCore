package listener;

import java.util.Date;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class HttpSessionListenerDemo
 *
 */
//@WebListener
public class HttpSessionListenerDemo implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public HttpSessionListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         String now = new Date().toString();
         System.out.println(now + ":HttpSessionListenerDemo SESSION 创建，SESSION ID="
				+arg0.getSession().getId());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         String now = new Date().toString();
         System.out.println(now + ":HttpSessionListenerDemo SESSION 销毁:SESSION ID="
        		 +arg0.getSession().getId());
    }
	
}
