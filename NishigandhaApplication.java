package com.example.demo;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@EnableScheduling
public class NishigandhaApplication extends SpringBootServletInitializer{
	
	// private static final Logger log = LoggerFactory.Logger(Application.class);


	public static void main(String[] args) {
		SpringApplication.run(NishigandhaApplication.class, args);
	}
	
	  @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	            return application.sources(NishigandhaApplication.class);
	            
	            
	    }

}



