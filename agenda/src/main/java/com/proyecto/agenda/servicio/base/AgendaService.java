package com.proyecto.agenda.servicio.base;

import java.util.List;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.modelo.Departamento;
import com.proyecto.agenda.modelo.Direccion;
import com.proyecto.agenda.modelo.Empleado;
import com.proyecto.agenda.modelo.Persona;
import com.proyecto.agenda.modelo.Telefono;

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

	public List<Direccion[]> getAllDireccion();

	public List<Departamento[]> getAllDepartamento();

	public List<Object[]> getAllTelefono();
	
	public Object findPersonaById(int id);

}
