package com.proyecto.agenda.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.proyecto.agenda.servicio.base.AgendaService;

@Controller
public class AgendaController {

	private AgendaService agendaService;

	@Autowired
	public AgendaController(AgendaService agendaService) {
		super();
		this.agendaService = agendaService;
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
