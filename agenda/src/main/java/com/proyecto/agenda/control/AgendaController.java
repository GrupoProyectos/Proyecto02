package com.proyecto.agenda.control;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.servicio.base.AgendaService;

/**
 * 
 * @author grupo4
 *
 */
@Controller
public class AgendaController {

	/**
	 * atributo agendaservice
	 */
	private AgendaService agendaService;

	/**
	 * 
	 * @param agendaService
	 */
	@Autowired
	public AgendaController(AgendaService agendaService) {
		super();
		this.agendaService = agendaService;
	}

	/**
	 * 
	 * @return "index"
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	public String getAllPersonas(Model model) {

		// Collection<Persona> personas = agendaService.getAllPersonas();
		List<Categoria> categorias = agendaService.getAllCategoria();

		System.out.println("-----------------------" + categorias);

		model.addAttribute("categories", categorias);

		return "userList";
	}
}
