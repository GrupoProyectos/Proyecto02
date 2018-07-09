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
@Table(name = "categorias")
public class Categoria {

	/**
	 * atributo idcategoria
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcategorias;

	/**
	 * atributo nombre
	 */
	@NotNull
	@Column(name = "nombre", length = 45)
	private String nombre;

	/**
	 * atributo descripcion
	 */
	@Column(name = "descripcion", length = 45)
	private String descripcion;

	/**
	 * 
	 * @return idcategorias
	 */
	public int getIdcategorias() {
		return idcategorias;
	}

	/**
	 * 
	 * @param idcategorias
	 */
	public void setIdcategorias(int idcategorias) {
		this.idcategorias = idcategorias;
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
	 * @return descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
