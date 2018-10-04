package test.modules;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import test.modules.components.TestComponent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
    	
    	 ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
    	 
    	 TestComponent test = ((TestComponent)context.getBean("testComponent"));
    	 System.out.println(test.getTest());
    	 
    	 ((AnnotationConfigApplicationContext)context).close();
    	 
    	} catch (Exception ex) {
    		ex.printStackTrace();
    	}
    }
}
