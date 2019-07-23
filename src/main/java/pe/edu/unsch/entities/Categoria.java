package pe.edu.unsch.entities;
// Generated 20-jul-2019 16:47:19 by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

	private Integer idcategoria;
	private String nombre;
	private int estado;
	private int identificacion;
	private Set servicios = new HashSet(0);

	public Categoria() {
	}

	public Categoria(String nombre, int estado, int identificacion) {
		this.nombre = nombre;
		this.estado = estado;
		this.identificacion = identificacion;
	}

	public Categoria(String nombre, int estado, int identificacion, Set servicios) {
		this.nombre = nombre;
		this.estado = estado;
		this.identificacion = identificacion;
		this.servicios = servicios;
	}

	public Integer getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(Integer idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public Set getServicios() {
		return this.servicios;
	}

	public void setServicios(Set servicios) {
		this.servicios = servicios;
	}

}
