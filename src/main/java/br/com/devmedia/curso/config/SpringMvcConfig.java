package br.com.devmedia.curso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//as annotations transformam as classes em beans que são gerenciadas pelo sistema de injeção de dependencia do spring
@Configuration
public class SpringMvcConfig {
	
	
	//classe para o spring saber como resover nossas paginas
	@Bean //o spring passa a controlar esse metodo
	public InternalResourceViewResolver viewResolver() { 
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp"); //nome de arquivo que vamos utilizar como pagina
		resolver.setViewClass(JstlView.class); //informa qual tipo de recurso nossas paginas jsp serão utilizados
		return resolver;
	}
}
