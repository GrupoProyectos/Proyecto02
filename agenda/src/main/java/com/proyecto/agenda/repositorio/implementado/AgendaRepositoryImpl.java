package com.proyecto.agenda.repositorio.implementado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.modelo.Empleado;
import com.proyecto.agenda.modelo.Persona;
import com.proyecto.agenda.repositorio.base.AgendaRepository;

/**
 * 
 * @author grupo4
 *
 */
@Repository
public class AgendaRepositoryImpl implements AgendaRepository {

	/**
	 * atributo entitiManager
	 */
	@PersistenceContext
	private EntityManager em;

	/**
	 * método persistContact
	 */
	@Override
	public void persistContact(Persona p) {
		// TODO Auto-generated method stub
		this.em.merge(p);
	}

	/**
	 * método para coger una lista de "personas"
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public Collection<Persona> getAllPersonas() {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery("SELECT nombre, apellido1, apellido2, dni, fechaNacimiento FROM personas");
		return query.getResultList();
	}

	/**
	 * método para coger una lista de "empleados"
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Empleado> getAllEmpleados() {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery(
				"select p.nombre, apellido1, apellido2, dni, fechaNacimiento, d.nombre, c.nombre, c.descripcion from personas p, empleados e, departamentos d, categorias c where p.idEmpleado = e.idempleados and e.idDepartamento = d.iddepartamento and e.idCategoria = c.idcategorias");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> getAllCategoria() {
		// TODO Auto-generated method stub
		Query query = this.em.getEntityManagerFactory().createEntityManager()
				.createQuery("select idcategorias, nombre, descripcion from Categoria");
		// Query query = this.em.createQuery("SELECT * FROM agenda.categorias");
		List<Categoria> categorias = new ArrayList<Categoria>();
		System.out.println("++++++++++++++++++++++++++++++++++++" + query.getResultList().get(0).toString());
		return query.getResultList();
	}

}
