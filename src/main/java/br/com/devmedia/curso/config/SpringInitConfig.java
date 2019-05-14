package br.com.devmedia.curso.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class}; //quando servidor iniciar essa classe é a primeira configuração da aplicação que ele tem que carregar
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringMvcConfig.class}; //diz qual classe que contem a parte de servlets pra nós
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"}; //o mapeamento dos servlets, quando encontrar "/" a aplicação vai saber que esta lidando com servlets
	}
	
}
