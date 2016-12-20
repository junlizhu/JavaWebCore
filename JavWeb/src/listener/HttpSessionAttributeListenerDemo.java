package listener;

import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class HttpSessionAttributeListenerDemo
 *
 */
@WebListener
public class HttpSessionAttributeListenerDemo implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public HttpSessionAttributeListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
    	String now = new Date().toString();
		System.out.println(now + ":HttpSessionAttributeListenerDemo "
				+ arg0.getSession().getId() + " **增加属性－－－>属性名称："
				+ arg0.getName() + ",属性内容：" + arg0.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
    	String now = new Date().toString();
		System.out.println(now + ":HttpSessionAttributeListenerDemo "
				+ arg0.getSession().getId() + " **删除属性－－－>属性名称："
				+ arg0.getName() + ",属性内容：" + arg0.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
    	String now = new Date().toString();
		System.out.println(now + ":HttpSessionAttributeListenerDemo "
				+ arg0.getSession().getId() + " **替换属性－－－>属性名称："
				+ arg0.getName() + ",属性内容：" + arg0.getValue());
    }
	
}
