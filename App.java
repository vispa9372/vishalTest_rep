package com.telusko.demoAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 = context.getBean(Samsung.class);
		s7.config();
    }
}
