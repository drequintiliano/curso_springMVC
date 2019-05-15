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


/* 
front controller que trabalha como um dispatcher Servlet
identifica o controller pela barra, 
a partir dali esta trablhando com a parte de servlet, 
cada parte da barra é chamada de path, cada metodo é um outro path,
no metodo se comunica com o model que se comunica com o banco de dados ou sistema de arquivos,
o controller devolve a pagina para o front controller,
a view renderiza num arquivo html que devolver para o front controller,
no navegador tem a resposta de uma estrutura de uma pagina html,
*/