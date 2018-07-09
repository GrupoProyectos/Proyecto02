package com.proyecto.agenda.servicio.implementado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.agenda.dao.base.AgendaDao;
import com.proyecto.agenda.modelo.Persona;
import com.proyecto.agenda.servicio.base.AgendaService;

@Component
public class AgendaServiceImpl implements AgendaService {

	private AgendaDao agendaDao;

	@Autowired
	public AgendaServiceImpl(AgendaDao agendaDao) {
		super();
		this.agendaDao = agendaDao;
	}

	@Override
	@Transactional
	public void saveContact(Persona p) {
		// TODO Auto-generated method stub
		agendaDao.saveContact(p);
	}

}
