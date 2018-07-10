package com.proyecto.agenda.servicio.base;

import java.util.Collection;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.modelo.Empleado;
import com.proyecto.agenda.modelo.Persona;

/**
 * 
 * @0author grupo4
 *
 */
public interface AgendaService {

	/**
	 * 
	 * @param p
	 */
	public void persistContact(Persona p);

	/**
	 * 
	 * @return colección de "personas"
	 */
	public Collection<Persona> getAllPersonas();

	public Collection<Empleado> getAllEmpleados();

	public Collection<Categoria> getAllCategoria();

}
