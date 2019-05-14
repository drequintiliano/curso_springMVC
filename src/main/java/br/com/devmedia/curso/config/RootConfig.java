package br.com.devmedia.curso.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("br.com.devmedia.curso") //serve para dizermos ao spring aonda deve procurar as classes que ira gerenciar (a paritr de curso, todos os pacotes serão scaneados)
@EnableWebMvc
public class RootConfig {

}
