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
@Table(name = "direcciones")
public class Direccion {

	/**
	 * atributo iddirecciones
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddirecciones;

	/**
	 * atributo direccion
	 */
	@NotNull
	@Column(name = "direccion", length = 45)
	private String direccion;

	/**
	 * atributo codPostal
	 */
	@NotNull
	@Column(name = "codPostal", length = 45)
	private String codPostal;

	/**
	 * atributo localidad
	 */
	@NotNull
	@Column(name = "localidad", length = 45)
	private String localidad;

	/**
	 * atributo provincia
	 */
	@NotNull
	@Column(name = "provincia", length = 45)
	private String provincia;

	/**
	 * atributo idPersona
	 */
	@Column(name = "idPersona")
	private String idPersona;

	/**
	 * 
	 * @return iddirecciones
	 */
	public Integer getIddirecciones() {
		return iddirecciones;
	}

	/**
	 * 
	 * @param iddirecciones
	 */
	public void setIddirecciones(Integer iddirecciones) {
		this.iddirecciones = iddirecciones;
	}

	/**
	 * 
	 * @return direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * 
	 * @return codPostal
	 */
	public String getCodPostal() {
		return codPostal;
	}

	/**
	 * 
	 * @param codPostal
	 */
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	/**
	 * 
	 * @return localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * 
	 * @param localidad
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * 
	 * @return provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * 
	 * @param provincia
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * 
	 * @return idPersona
	 */
	public String getIdPersona() {
		return idPersona;
	}

	/**
	 * 
	 * @param idPersona
	 */
	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

}
