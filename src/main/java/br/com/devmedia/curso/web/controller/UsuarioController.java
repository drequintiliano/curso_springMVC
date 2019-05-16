package br.com.devmedia.curso.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.devmedia.curso.dao.UsuarioDao;

@Controller
@RequestMapping("usuario") //por padrão ele vai entender que esse valor seria respectivo ao 'value'
public class UsuarioController {
	
	@Autowired //injetar dentro do meu controller, o objeto referente ao usuarioDao - injeção de dependencia 
	private UsuarioDao dao;
	
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	public ModelAndView listaTodos(ModelMap model) { //spring cria a instancia de modelmap
		model.addAttribute("usuarios", dao.getTodos());
		return new ModelAndView("/user/list", model);
	}
}
