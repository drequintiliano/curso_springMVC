package br.com.devmedia.curso.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class}; //quando servidor iniciar essa classe � a primeira configura��o da aplica��o que ele tem que carregar
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringMvcConfig.class}; //diz qual classe que contem a parte de servlets pra n�s
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"}; //o mapeamento dos servlets, quando encontrar "/" a aplica��o vai saber que esta lidando com servlets
	}
	
}
