package com.proyecto.agenda.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.modelo.Departamento;
import com.proyecto.agenda.modelo.Direccion;
import com.proyecto.agenda.modelo.Empleado;
import com.proyecto.agenda.modelo.Persona;
import com.proyecto.agenda.modelo.Telefono;
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

		List<Persona[]> objetos = agendaService.getAllPersonas();

		model.addAttribute("people", objetos);

		return "userList";
	}

	@RequestMapping(value = "/categoryList", method = RequestMethod.GET)
	public String getAllCategorias(Model model) {

		List<Categoria[]> objetos = agendaService.getAllCategoria();

		model.addAttribute("categories", objetos);

		return "categoryList";
	}

	@RequestMapping(value = "/employeeList", method = RequestMethod.GET)
	public String getAllEmpleados(Model model) {

		List<Empleado[]> objetos = agendaService.getAllEmpleados();

		model.addAttribute("employees", objetos);

		return "employeeList";
	}

	@RequestMapping(value = "/addressList", method = RequestMethod.GET)
	public String getAllDireccion(Model model) {

		List<Direccion[]> objetos = agendaService.getAllDireccion();

		model.addAttribute("addresses", objetos);

		return "addressList";
	}

	@RequestMapping(value = "/departamentList", method = RequestMethod.GET)
	public String getAllDepartamento(Model model) {

		List<Departamento[]> objetos = agendaService.getAllDepartamento();

		model.addAttribute("departments", objetos);

		return "departamentList";
	}

	@RequestMapping(value = "/phoneList", method = RequestMethod.GET)
	public String getAllTelefono(Model model) {

		List<Object[]> objetos = agendaService.getAllTelefono();

		model.addAttribute("phones", objetos);
		model.addAttribute("phonescount", objetos.size() - 1);

		return "phoneList";
	}

	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	public ModelAndView showOwner(@PathVariable("userId") int userId) {
		ModelAndView mav = new ModelAndView("userDetails");
		mav.addObject("user", this.agendaService.findPersonaById(userId));
		return mav;
	}
	
	@RequestMapping("/addUser")
	public void persistContact(Persona p){
		
		this.agendaService.persistContact(p);
		
	}
	
	
	
}
