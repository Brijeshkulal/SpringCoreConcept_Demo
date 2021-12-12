package com.labz.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.labz.springconcepts.component.DemoBean;

@SpringBootApplication
public class SpringConceptsApplication {
	
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to spring concept demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		logger.warn("Demo Bean = "+demoBean.toString());
	}

}
