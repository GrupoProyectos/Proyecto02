package com.proyecto.agenda.servicio.implementado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.modelo.Departamento;
import com.proyecto.agenda.modelo.Direccion;
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

	@Override
	public List<Direccion[]> getAllDireccion() {
		// TODO Auto-generated method stub
		return agendaRepositorio.getAllDireccion();
	}

	@Override
	public List<Departamento[]> getAllDepartamento() {
		// TODO Auto-generated method stub
		return agendaRepositorio.getAllDepartamento();
	}

	@Override
	public List<Object[]> getAllTelefono() {
		// TODO Auto-generated method stub
		return agendaRepositorio.getAllTelefono();
	}

	@Override
	public Object findPersonaById(int id) {
		return agendaRepositorio.findPersonaById(id);
	}

	@Override
	public Object findEmpleadoById(int id) {
		// TODO Auto-generated method stub
		return agendaRepositorio.findEmpleadoById(id);
	}

	@Override
	public Object findCategoriaById(int id) {
		// TODO Auto-generated method stub
		return agendaRepositorio.findCategoriaById(id);
	}

	@Override
	public Object findDireccionById(int id) {
		// TODO Auto-generated method stub
		return agendaRepositorio.findDireccionById(id);
	}

	@Override
	public Object findDepartamentoById(int id) {
		// TODO Auto-generated method stub
		return agendaRepositorio.findDepartamentoById(id);
	}

	@Override
	public Object findTelefonoByPersonId(int id) {
		// TODO Auto-generated method stub
		return agendaRepositorio.findTelefonoByPersonId(id);
	}

}
