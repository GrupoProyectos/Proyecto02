package com.proyecto.agenda.repositorio.base;

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
	public List<Persona[]> getAllPersonas();

	/**
	 * 
	 * @return colección de "empleados"
	 */
	public List<Empleado[]> getAllEmpleados();

	public List<Categoria[]> getAllCategoria();

}
