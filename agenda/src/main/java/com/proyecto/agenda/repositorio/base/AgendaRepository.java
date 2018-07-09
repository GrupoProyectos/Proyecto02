package com.proyecto.agenda.repositorio.base;

import com.proyecto.agenda.modelo.Persona;

public interface AgendaRepository {
	public void persistContact(Persona p);
}
