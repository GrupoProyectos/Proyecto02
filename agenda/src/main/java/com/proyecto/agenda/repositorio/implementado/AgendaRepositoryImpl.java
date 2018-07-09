package com.proyecto.agenda.repositorio.implementado;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.proyecto.agenda.modelo.Empleado;
import com.proyecto.agenda.modelo.Persona;
import com.proyecto.agenda.repositorio.base.AgendaRepository;

@Repository
public class AgendaRepositoryImpl implements AgendaRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void persistContact(Persona p) {
		// TODO Auto-generated method stub
		this.em.merge(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Persona> getAllPersonas() {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery("SELECT nombre, apellido1, apellido2, dni, fechaNacimiento FROM personas");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Empleado> getAllEmpleados() {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery(
				"select p.nombre, apellido1, apellido2, dni, fechaNacimiento, d.nombre, c.nombre, c.descripcion from personas p, empleados e, departamentos d, categorias c where p.idEmpleado = e.idempleados and e.idDepartamento = d.iddepartamento and e.idCategoria = c.idcategorias");
		return query.getResultList();
	}

}
