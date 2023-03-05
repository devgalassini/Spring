package qintess.academiajava.classes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = "qintess.academiajava.classes.controllers")
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views");
		resolver.setPrefix(".jsp");
	
return resolver;
}
}