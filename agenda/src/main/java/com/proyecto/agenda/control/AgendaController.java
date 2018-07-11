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
import com.proyecto.agenda.modelo.Empleado;
import com.proyecto.agenda.modelo.Persona;
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

		List<Persona[]> objetos = agendaService.getAllPersonas();

		model.addAttribute("people", objetos);

		return "userList";
	}

	@RequestMapping(value = "/categoryList", method = RequestMethod.GET)
	public String getAllCategorias(Model model) {

		// Collection<Persona> personas = agendaService.getAllPersonas();

		List<Categoria[]> objetos = agendaService.getAllCategoria();

		model.addAttribute("categories", objetos);

		return "categoryList";
	}

	@RequestMapping(value = "/employeeList", method = RequestMethod.GET)
	public String getAllEmpleados(Model model) {

		// Collection<Persona> personas = agendaService.getAllPersonas();

		List<Empleado[]> objetos = agendaService.getAllEmpleados();

		model.addAttribute("employees", objetos);

		return "employeeList";
	}
	
	@RequestMapping("/addUser")
	public void persistContact(Persona p){
		
		this.agendaService.persistContact(p);
		
	}
	
	
	
}
