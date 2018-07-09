package com.proyecto.agenda.repositorio.base;

import java.util.Collection;

import com.proyecto.agenda.modelo.Empleado;
import com.proyecto.agenda.modelo.Persona;

public interface AgendaRepository {

	public void persistContact(Persona p);

	public Collection<Persona> getAllPersonas();
	
	public Collection<Empleado> getAllEmpleados();

}
