package com.proyecto.agenda.modelo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

public class AgendaTests {

	@Test
	@Transactional
	public void testHasPet() {

		Persona persona = new Persona();

		assertNull(persona.getNombre());
		
		Empleado emp1 = new Empleado();	
		Empleado emp2 = new Empleado();
		assertNull(emp1.getSalario());
		assertSame(emp1.getClass(), emp2.getClass());
		assertSame(emp1.getCodEmpleado(), emp2.getSalario());
		assertNotNull(emp2.getClass());
		
		Telefono tlf1 = new Telefono();
		Telefono tlf2 = new Telefono();
		assertNull(tlf1.getIdtelefonos());
		assertEquals(tlf1.getClass(), tlf2.getClass());
		assertNotEquals(emp1.getClass(), tlf2.getClass());
		
		Departamento dpt1 = new Departamento(10,"RRHH");
		Departamento dpt2 = new Departamento(20,"DESARROLLO");
		assertNotNull(dpt1.getNombre());
		assertNull(dpt2.getNombre());
		assertNotSame(dpt1.getIddepartamento(), dpt2.getIddepartamento());
		
		Categoria ctg1 = new Categoria(100, "junior","Menos de 2 años de experiencia");
		Categoria ctg2 = new Categoria(200, "senior","Mas de 2 años de experiencia");
		assertEquals(ctg1.getDescripcion(), ctg2.getDescripcion());
		assertNotNull(ctg2.getIdcategorias());
		
		Direccion drc1 = new Direccion(1,"C/ Mahou 33","28028","Madrid","Madrid","1"); 
		Direccion drc2 = new Direccion(2,"C/ Mahou 66","28028","Madrid","Madrid","2");
		assertSame(drc1.getLocalidad(), drc2.getProvincia());
		assertEquals(drc1.getLocalidad(), drc2.getProvincia());
		assertEquals(drc1.getLocalidad(), drc2.getLocalidad());
		assertNotSame(drc1.getIddirecciones(), drc2.getIddirecciones());
		
		
	}


}
