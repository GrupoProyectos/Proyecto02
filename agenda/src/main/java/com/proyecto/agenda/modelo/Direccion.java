package com.proyecto.agenda.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "direcciones")
public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddirecciones;

	@NotNull
	@Column(name = "direccion", length = 45)
	private String direccion;

	@NotNull
	@Column(name = "codPostal", length = 45)
	private String codPostal;

	@NotNull
	@Column(name = "localidad", length = 45)
	private String localidad;

	@NotNull
	@Column(name = "provincia", length = 45)
	private String provincia;

	@Column(name = "idPersona")
	private String idPersona;

	public Integer getIddirecciones() {
		return iddirecciones;
	}

	public void setIddirecciones(Integer iddirecciones) {
		this.iddirecciones = iddirecciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

}
