package com.proyecto.agenda.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.modelo.Departamento;
import com.proyecto.agenda.modelo.Direccion;
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

	@GetMapping(value = "/userList")
	public String getAllPersonas(Model model) {

		List<Persona[]> objetos = agendaService.getAllPersonas();

		model.addAttribute("people", objetos);

		return "listado/userList";
	}

	@GetMapping(value = "/categoryList")
	public String getAllCategorias(Model model) {

		List<Categoria[]> objetos = agendaService.getAllCategoria();

		model.addAttribute("categories", objetos);

		return "listado/categoryList";
	}

	@GetMapping(value = "/employeeList")
	public String getAllEmpleados(Model model) {

		List<Empleado[]> objetos = agendaService.getAllEmpleados();

		model.addAttribute("employees", objetos);

		return "listado/employeeList";
	}

	@GetMapping(value = "/addressList")
	public String getAllDireccion(Model model) {

		List<Direccion[]> objetos = agendaService.getAllDireccion();

		model.addAttribute("addresses", objetos);

		return "listado/addressList";
	}

	@GetMapping(value = "/departamentList")
	public String getAllDepartamento(Model model) {

		List<Departamento[]> objetos = agendaService.getAllDepartamento();

		model.addAttribute("departments", objetos);

		return "listado/departamentList";
	}

	@GetMapping(value = "/phoneList")
	public String getAllTelefono(Model model) {

		List<Object[]> objetos = agendaService.getAllTelefono();

		model.addAttribute("phones", objetos);
		model.addAttribute("phonescount", objetos.size() - 1);

		return "listado/phoneList";
	}

	@PostMapping(value = "/user/{userId}")
	public ModelAndView showUserPost(@PathVariable("userId") Integer userId) {
		ModelAndView mav = new ModelAndView("detalle/userDetails");
		mav.addObject("user", this.agendaService.findPersonaById(userId));
		mav.addObject("phones", this.agendaService.findTelefonosByPersonId(userId));
		mav.addObject("phonescount", this.agendaService.findTelefonosByPersonId(userId).size() - 1);
		mav.addObject("addresses", this.agendaService.findDireccionesByPersonId(userId));
		return mav;
	}

	@GetMapping(value = "/user/{userId}")
	public ModelAndView showUserGet(@PathVariable("userId") Integer userId) {
		ModelAndView mav = new ModelAndView("detalle/userDetails");
		mav.addObject("user", this.agendaService.findPersonaById(userId));
		mav.addObject("phones", this.agendaService.findTelefonosByPersonId(userId));
		mav.addObject("phonescount", this.agendaService.findTelefonosByPersonId(userId).size() - 1);
		mav.addObject("addresses", this.agendaService.findDireccionesByPersonId(userId));
		return mav;
	}

	@RequestMapping("/addUser")
	public String addUser() {

		return "addUser";

	}

}
