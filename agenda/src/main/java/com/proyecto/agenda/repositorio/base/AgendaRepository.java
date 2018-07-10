package com.proyecto.agenda.repositorio.base;

import java.util.Collection;
import java.util.List;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.modelo.Empleado;
import com.proyecto.agenda.modelo.Persona;

/**
 * 
 * @author grupo4
 *
 */
public interface AgendaRepository {

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

	/**
	 * 
	 * @return colección de "empleados"
	 */
	public Collection<Empleado> getAllEmpleados();

	public List<Categoria> getAllCategoria();

}
