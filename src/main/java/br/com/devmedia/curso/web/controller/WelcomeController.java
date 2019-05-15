package br.com.devmedia.curso.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET) // "method"-qual tipo de protocolo http vai trabalhar com esse metodo
	public String welcome() {
		return "welcome";
	}
	
	//"ModelAndView" - objeto do proprio spring para enviar informa��es para sua pagina
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public ModelAndView teste() {
		ModelAndView view = new ModelAndView("welcome");
		view.addObject("teste", "Hello i am Spring MVC");
		return view;
	}
}