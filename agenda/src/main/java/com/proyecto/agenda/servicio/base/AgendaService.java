package com.proyecto.agenda.servicio.base;

import java.util.List;

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
	public List<Persona[]> getAllPersonas();

	public List<Empleado[]> getAllEmpleados();

	public List<Categoria[]> getAllCategoria();

}
