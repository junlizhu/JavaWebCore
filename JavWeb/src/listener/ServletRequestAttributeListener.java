package listener;

import java.util.Date;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletRequestAttributeListener
 *
 */
@WebListener
public class ServletRequestAttributeListener implements javax.servlet.ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public ServletRequestAttributeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
    	String now = new Date().toString();
    	System.out.println(now + ":ServletRequestAllListenerDemo " + " **删除ｒｅｑｕｅｓｔ属性－－－>属性名称："
				+ arg0.getName() + ",属性内容："
				+ arg0.getValue());
	}

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
    	String now = new Date().toString();
		System.out.println(now + ":ServletRequestAllListenerDemo " + " **增加ｒｅｑｕｅｓｔ属性－－－>属性名称："
				+ arg0.getName() + ",属性内容："
				+ arg0.getValue());
	}

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
    	String now = new Date().toString();
		System.out.println(now + ":ServletRequestAllListenerDemo " + " **替换ｒｅｑｕｅｓｔ属性－－－>属性名称："
				+ arg0.getName() + ",属性内容："
				+ arg0.getValue());
		System.out.println(now + ":ServletRequestAllListenerDemo " + " **新的ｒｅｑｕｅｓｔ属性－－－>属性名称："
				+ arg0.getName() + ",属性内容："
				+ arg0.getServletRequest().getAttribute(arg0.getName()));
		
    }
	
}
