package com.proyecto.agenda.repositorio.implementado;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.agenda.modelo.Categoria;
import com.proyecto.agenda.modelo.Departamento;
import com.proyecto.agenda.modelo.Direccion;
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
	public List<Persona[]> getAllPersonas() {
		// TODO Auto-generated method stub
		Query query = this.em
				.createQuery("SELECT idpersonas, nombre, apellido1, apellido2, dni, fechaNacimiento FROM Persona");
		this.em.close();
		return query.getResultList();
	}

	/**
	 * método para coger una lista de "empleados"
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Empleado[]> getAllEmpleados() {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery(
				"select p.idpersonas, p.nombre, p.apellido1, p.apellido2, p.dni, p.fechaNacimiento, d.nombre, c.nombre, c.descripcion from Persona p, Empleado e, Departamento d, Categoria c where p.idEmpleado = e.idempleados and e.idDepartamento = d.iddepartamento and e.idCategoria = c.idcategorias");
		this.em.close();
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Categoria[]> getAllCategoria() {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery("select idcategorias, nombre, descripcion from Categoria");
		this.em.close();
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Direccion[]> getAllDireccion() {
		// TODO Auto-generated method stub
		Query query = this.em
				.createQuery("select iddirecciones, direccion, codPostal, localidad, provincia from Direccion");
		this.em.close();
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Departamento[]> getAllDepartamento() {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery("select iddepartamento, nombre from Departamento");

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Object[]> getAllTelefono() {
		// TODO Auto-generated method stub

		Query query = this.em.createQuery(
				"select t.idtelefonos, t.telefono, p.nombre, p.apellido1, p.apellido2 from Telefono t, Persona p where t.idPersona = p.idpersonas");
		this.em.close();
		return query.getResultList();
	}

	public Object findPersonaById(int id) {
		Query query = this.em.createQuery(
				"select distinct p.idpersonas, p.nombre, p.apellido1, p.apellido2, p.dni, p.fechaNacimiento, d.nombre, c.nombre, c.descripcion, e.codEmpleado, e.salario, e.fechaAlta from Persona p, Empleado e, Departamento d, Categoria c, Direccion dir where p.idpersonas  =:id and p.idEmpleado = e.idempleados and e.idDepartamento = d.iddepartamento and e.idCategoria = c.idcategorias and dir.idPersona = p.idpersonas");
		query.setParameter("id", id);
		return query.getSingleResult();

	}

	@Override
	@Transactional
	public Object findEmpleadoById(int id) {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery(
				"SELECT p.nombre, p.apellido1, p.apellido2, e.codEmpleado, e.salario, e.fechaAlta FROM Empleado e, Persona p where e.idempleados = p.idEmpleado and idEmpleado =:id");
		query.setParameter("id", id);
		this.em.close();
		return query.getSingleResult();
	}

	@Override
	@Transactional
	public Object findCategoriaById(int id) {
		Query query = this.em.createQuery("SELECT nombre, descripcion FROM Categoria where idcategorias =:id");
		query.setParameter("id", id);
		this.em.close();
		return query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findDireccionesByPersonId(Integer id) {
		// TODO Auto-generated method stub
		Query query = this.em
				.createQuery("SELECT direccion, codPostal, localidad, provincia FROM Direccion where idPersona =:id");
		query.setParameter("id", id);
		this.em.close();
		return query.getResultList();
	}

	@Override
	@Transactional
	public Object findDepartamentoById(int id) {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery("SELECT nombre FROM Departamento where iddepartamento =:id");
		query.setParameter("id", id);
		this.em.close();
		return query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Object[]> findTelefonosByPersonId(int id) {
		// TODO Auto-generated method stub
		Query query = this.em.createQuery(
				"SELECT p.nombre, p.apellido1, p.apellido2, t.telefono FROM Persona p, Telefono t where idPersona = idpersonas and idpersonas =:id");
		query.setParameter("id", id);
		this.em.close();
		return query.getResultList();
	}

}
