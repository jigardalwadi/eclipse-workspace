package com.jigar.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext factory = new AnnotationConfigApplicationContext(Annconfigue.class);
      	
      Samsung sms = factory.getBean(Samsung.class);
      sms.config();
    }
}
 