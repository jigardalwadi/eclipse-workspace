package com.jigar.Demohibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mysql.jdbc.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	alien jigar = new alien();
    	jigar.setAid(101);
    	jigar.setAname("Jigar");
    	jigar.setColor("red");
    	
    	Configuration con = new Configuration().addAnnotatedClass(alien.class); 
    	ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(jigar);
    		
    	tx.commit();
    }
}