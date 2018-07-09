package com.proyecto.agenda.modelo;

import java.util.Date;

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
@Table(name = "personas")
public class Persona {

	/**
	 * atributo idpersona
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpersonas;

	/**
	 * atributo nombre
	 */
	@NotNull
	@Column(name = "nombre", length = 45)
	private String nombre;

	/**
	 * atributo apellido1
	 */
	@NotNull
	@Column(name = "apellido1", length = 45)
	private String apellido1;

	/**
	 * atributo apellido2
	 */
	@Column(name = "apellido2", length = 45)
	private String apellido2;

	/**
	 * atributo dni
	 */
	@Column(name = "dni", length = 20)
	private String dni;

	/**
	 * atributo fechaNacimiento
	 */
	@Column(name = "fechaNacimiento")
	private Date fechaNacimiento;

	/**
	 * atributo idEmpleado
	 */
	@Column(name = "idEmpleado")
	private Integer idEmpleado;

	/**
	 * 
	 * @return idpersonas
	 */
	public Integer getIdpersonas() {
		return idpersonas;
	}
	/**
	 * 
	 * @param idpersonas
	 */

	public void setIdpersonas(Integer idpersonas) {
		this.idpersonas = idpersonas;
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

	/**
	 * 
	 * @return apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * 
	 * @param apellido1
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * 
	 * @return apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}
	/**
	 * 
	 * @param apellido2
	 */

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * 
	 * @return dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * 
	 * @return fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * 
	 * @param fechaNacimiento
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * 
	 * @return idEmpleado
	 */
	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	/**
	 * 
	 * @param idEmpleado
	 */
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

}
