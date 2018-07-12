package com.proyecto.agenda.repositorio.base;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.modelo.Departamento;
import com.proyecto.agenda.modelo.Direccion;
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
	public void persistContact(Persona p) throws DataAccessException;;

	/**
	 * 
	 * @return colección de "personas"
	 */
	public List<Persona[]> getAllPersonas() throws DataAccessException;;

	/**
	 * 
	 * @return colección de "empleados"
	 */
	public List<Empleado[]> getAllEmpleados() throws DataAccessException;

	public List<Categoria[]> getAllCategoria() throws DataAccessException;

	public List<Direccion[]> getAllDireccion() throws DataAccessException;

	public List<Departamento[]> getAllDepartamento() throws DataAccessException;

	public List<Object[]> getAllTelefono() throws DataAccessException;

	public Object findPersonaById(int id) throws DataAccessException;

	public Object findEmpleadoById(int id) throws DataAccessException;

	public Object findCategoriaById(int id) throws DataAccessException;

	public List<Object[]> findDireccionesByPersonId(Integer id) throws DataAccessException;

	public Object findDepartamentoById(int id) throws DataAccessException;

	public List<Object[]> findTelefonosByPersonId(int id) throws DataAccessException;

	public void deletePersonById(int id) throws DataAccessException;

}
