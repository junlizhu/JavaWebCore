package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextAttributeListenter
 *
 */
@WebListener
public class ServletContextAttributeListenter implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ServletContextAttributeListenter() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("** 增加属性 --> 属性名称：" + arg0.getName() + "，属性内容：" + arg0.getValue());
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("** 删除属性 --> 属性名称：" + arg0.getName() + "，属性内容：" + arg0.getValue());
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("** 替换属性 --> 属性名称：" + arg0.getName() + "，属性内容：" + arg0.getValue());
    }
	
}
