package com.proyecto.agenda.repositorio.implementado;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

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

}
