package com.proyecto.agenda.modelo;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

public class AgendaTests {

	@Test
	@Transactional
	public void testHasPet() {

		Persona persona = new Persona();

		assertNull(persona.getNombre());

	}

}
