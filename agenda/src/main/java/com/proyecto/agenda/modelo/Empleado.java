package com.proyecto.agenda.modelo;

import java.sql.Timestamp;

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
@Table(name = "empleados")
public class Empleado {

	/**
	 * atributo idempleados
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idempleados;

	/**
	 * atributo codEmpleado
	 */
	@NotNull
	@Column(name = "codEmpleado", length = 45)
	private String codEmpleado;

	/**
	 * atriuto salario
	 */
	@Column(name = "salario", length = 45)
	private String salario;

	/**
	 * atributo fechaAlta
	 */
	@Column(name = "fechaAlta")
	private Timestamp fechaAlta;

	/**
	 * atributo idDepartamento
	 */
	@Column(name = "idDepartamento")
	private Integer idDepartamento;

	/**
	 * atributo idCategoria
	 */
	@Column(name = "idCategoria")
	private Integer idCategoria;

	/**
	 * constructor vacío
	 */
	public Empleado() {
		super();
	}

	/**
	 * 
	 * @param idempleados
	 * @param codEmpleado
	 * @param salario
	 * @param fechaAlta
	 */
	public Empleado(Integer idempleados, @NotNull String codEmpleado, String salario, Timestamp fechaAlta) {
		super();
		this.idempleados = idempleados;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;
	}

	/**
	 * 
	 * @param idempleados
	 * @param codEmpleado
	 * @param salario
	 * @param fechaAlta
	 * @param idDepartamento
	 * @param idCategoria
	 */
	public Empleado(Integer idempleados, @NotNull String codEmpleado, String salario, Timestamp fechaAlta,
			Integer idDepartamento, Integer idCategoria) {
		super();
		this.idempleados = idempleados;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;
		this.idDepartamento = idDepartamento;
		this.idCategoria = idCategoria;
	}

	/**
	 * 
	 * @return idempleados
	 */
	public Integer getIdempleados() {
		return idempleados;
	}

	/**
	 * 
	 * @param idempleados
	 */

	public void setIdempleados(Integer idempleados) {
		this.idempleados = idempleados;
	}

	/**
	 * 
	 * @return codEmpleado
	 */
	public String getCodEmpleado() {
		return codEmpleado;
	}

	/**
	 * 
	 * @param codEmpleado
	 */
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	/**
	 * 
	 * @return salario
	 */
	public String getSalario() {
		return salario;
	}

	/**
	 * 
	 * @param salario
	 */
	public void setSalario(String salario) {
		this.salario = salario;
	}

	/**
	 * 
	 * @return fechaAlta
	 */
	public Timestamp getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * 
	 * @param fechaAlta
	 */
	public void setFechaAlta(Timestamp fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * 
	 * @return idDepartamento
	 */
	public Integer getIdDepartamento() {
		return idDepartamento;
	}

	/**
	 * 
	 * @param idDepartamento
	 */
	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	/**
	 * 
	 * @return idCategoria
	 */
	public Integer getIdCategoria() {
		return idCategoria;
	}

	/**
	 * 
	 * @param idCategoria
	 */
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

}
