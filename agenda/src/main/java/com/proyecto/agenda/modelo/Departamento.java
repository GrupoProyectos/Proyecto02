package com.proyecto.agenda.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author grupo4
 *
 */

@Entity
@Table(name = "departamentos")
public class Departamento {

	/**
	 * atributo iddepartamento
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddepartamento;

	/**
	 * atributo nombre
	 */
	@NotNull
	@Column(name = "nombre", length = 45)
	private String nombre;

	/**
	 * 
	 * @return iddepartamento
	 */
	public Integer getIddepartamento() {
		return iddepartamento;
	}

	/**
	 * 
	 * @param iddepartamento
	 */
	public void setIddepartamento(Integer iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	/**
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
