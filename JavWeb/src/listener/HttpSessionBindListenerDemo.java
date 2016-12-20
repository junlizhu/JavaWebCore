package listener;

import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class HttpSessionBindListenerDemo
 *
 */
//@WebListener
public class HttpSessionBindListenerDemo implements HttpSessionBindingListener {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public HttpSessionBindListenerDemo(String name) {
    	this.setName(name);
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent arg0)  { 
    	String now = new Date().toString();
		System.out.println(now + ":在session 中保存的HttpSessionBindListenerDemo 对象，（name= " + this.getName()
				+ "),session id =" + arg0.getSession().getId());
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent arg0)  { 
    	String now = new Date().toString();
		System.out.println(now + ":从session 中移除的HttpSessionBindListenerDemo 对象，（name= " + this.getName()
				+ "),session id =" + arg0.getSession().getId());
    }
	
}
