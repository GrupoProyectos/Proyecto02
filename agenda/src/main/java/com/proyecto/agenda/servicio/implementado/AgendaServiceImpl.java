package com.proyecto.agenda.servicio.implementado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.agenda.modelo.Persona;
import com.proyecto.agenda.repositorio.base.AgendaRepository;
import com.proyecto.agenda.servicio.base.AgendaService;

@Component
public class AgendaServiceImpl implements AgendaService {

	private AgendaRepository agendaRepositorio;

	@Autowired
	public AgendaServiceImpl(AgendaRepository agendaRepositorio) {
		super();
		this.agendaRepositorio = agendaRepositorio;
	}

	@Override
	@Transactional
	public void persistContact(Persona p) {
		agendaRepositorio.persistContact(p);
	}

}
