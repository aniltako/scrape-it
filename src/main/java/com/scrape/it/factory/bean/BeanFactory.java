package com.scrape.it.factory.bean;

import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.scrape.it.factory.ScrapeManagerFactory;


@Configuration
@ComponentScan("com.scrape.it")
public class BeanFactory {
	
	@Bean
	public ServiceLocatorFactoryBean getJsonParseManagerFactory() {
		ServiceLocatorFactoryBean s = new ServiceLocatorFactoryBean();
		s.setServiceLocatorInterface(ScrapeManagerFactory.class);
		return s;
	}
}