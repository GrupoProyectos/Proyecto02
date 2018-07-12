package com.proyecto.agenda.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author grupo4
 *
 */
@Entity
@Table(name = "telefonos")
public class Telefono {

	/**
	 * identificador del teléfono
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idtelefonos;

	/**
	 * número de teléfono
	 */
	@Column(name = "telefono", length = 45)
	private String telefono;

	/**
	 * identificador de la persona que tiene ese número de teléfono
	 */
	@Column(name = "idPersona")
	private Integer idPersona;

	/**
	 * constructor vacío
	 */
	public Telefono() {
		super();
	}

	/**
	 * 
	 * @param idtelefonos
	 * @param telefono
	 * @param idPersona
	 */
	public Telefono(Integer idtelefonos, String telefono, Integer idPersona) {
		super();
		this.idtelefonos = idtelefonos;
		this.telefono = telefono;
		this.idPersona = idPersona;
	}

	/**
	 * 
	 * @return idtelefonos
	 */
	public Integer getIdtelefonos() {
		return idtelefonos;
	}

	/**
	 * 
	 * @param idTelefonos
	 */

	public void setIdtelefonos(Integer idtelefonos) {
		this.idtelefonos = idtelefonos;
	}

	/**
	 * 
	 * @return telefono
	 */

	public String getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * 
	 * @return idPersona
	 */
	public Integer getIdPersona() {
		return idPersona;
	}

	/**
	 * 
	 * @param idPersona
	 */

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

}
