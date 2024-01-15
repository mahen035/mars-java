package com.training.springmvc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@PropertySource("classpath:database.properties")
@ComponentScan(basePackages="com.training.springmvc")
public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Autowired
	Environment env;
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource dmDataSource = new DriverManagerDataSource();
		dmDataSource.setUrl(env.getProperty("url"));
		dmDataSource.setDriverClassName(env.getProperty("driver"));
		dmDataSource.setUsername(env.getProperty("dbuser"));
		dmDataSource.setPassword(env.getProperty("dbpassword"));
		return dmDataSource;
	}

}
