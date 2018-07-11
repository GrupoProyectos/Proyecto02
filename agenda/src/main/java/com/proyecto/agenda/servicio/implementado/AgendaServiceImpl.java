package com.proyecto.agenda.servicio.implementado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.modelo.Empleado;
import com.proyecto.agenda.modelo.Persona;
import com.proyecto.agenda.repositorio.base.AgendaRepository;
import com.proyecto.agenda.servicio.base.AgendaService;

/**
 * 
 * @author grupo4
 *
 */
@Component
public class AgendaServiceImpl implements AgendaService {

	/**
	 * atributo agendaRepositorio
	 */
	private AgendaRepository agendaRepositorio;

	/**
	 * 
	 * @param agendaRepositorio
	 */
	@Autowired
	public AgendaServiceImpl(AgendaRepository agendaRepositorio) {
		super();
		this.agendaRepositorio = agendaRepositorio;
	}

	/**
	 * 
	 * @param p
	 */
	@Override
	@Transactional
	public void persistContact(Persona p) {
		agendaRepositorio.persistContact(p);
	}

	/**
	 * 
	 * @return agendaRepositorio
	 */

	@Override
	public List<Persona[]> getAllPersonas() {
		// TODO Auto-generated method stub
		return agendaRepositorio.getAllPersonas();
	}

	@Override
	public List<Empleado[]> getAllEmpleados() {
		// TODO Auto-generated method stub
		return agendaRepositorio.getAllEmpleados();
	}

	@Override
	public List<Categoria[]> getAllCategoria() {
		// TODO Auto-generated method stub
		return agendaRepositorio.getAllCategoria();
	}

}
