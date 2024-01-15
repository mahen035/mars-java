package com.training.hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.training.hibernate.entity.Student;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration conf = new Configuration();
			
			Properties props = new Properties();
			
			props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			props.put(Environment.URL, "jdbc:mysql://localhost:3306/mars_sept");
			props.put(Environment.USER, "root");
			props.put(Environment.PASS, "pass123");
			
			props.put(Environment.SHOW_SQL, "true");
			
			props.put(Environment.HBM2DDL_AUTO, "update");
			props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			
			conf.setProperties(props);
			conf.addAnnotatedClass(Student.class);
			
			ServiceRegistry registry = new StandardServiceRegistryBuilder()
					                   .applySettings(conf.getProperties()).build();
			sessionFactory = conf.buildSessionFactory(registry);
			
			
		}
		return sessionFactory;
	}

}
