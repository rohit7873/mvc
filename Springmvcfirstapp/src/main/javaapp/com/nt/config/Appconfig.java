package com.nt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@PropertySource("classpath:App.properties")
@ComponentScan("com.nt")
public class Appconfig 
{
	@Autowired
	private Environment env;
	
	@Bean
	public InternalResourceViewResolver resolve()
	{
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix(env.getProperty("prefix"));
		resolver.setSuffix(env.getProperty("suffix"));
		return resolver;
	}

}
