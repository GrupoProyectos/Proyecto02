package com.proyecto.agenda.servicio.base;

import java.util.Collection;

import com.proyecto.agenda.modelo.Persona;

public interface AgendaService {

	public void persistContact(Persona p);
	
	public Collection<Persona> getAllPersonas();

}
