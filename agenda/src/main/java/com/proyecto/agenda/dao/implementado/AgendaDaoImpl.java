package com.proyecto.agenda.dao.implementado;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.proyecto.agenda.dao.base.AgendaDao;
import com.proyecto.agenda.modelo.Persona;

@Repository
public class AgendaDaoImpl implements AgendaDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void saveContact(Persona p) {
		// TODO Auto-generated method stub
		this.em.merge(p);
	}

}
