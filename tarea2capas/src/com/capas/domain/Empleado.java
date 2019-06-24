package com.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema="public",name="empleado")
public class Empleado {

	@Id
	@GeneratedValue(generator="empleado_id_empleado_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "empleado_id_empleado_seq", sequenceName = "public.empleado_id_empleado_seq")
	@Column(name="id_empleado")
	private Integer idempleado;
	
	@NotNull(message = "Este campo es requerido!!!!")
	@Column(name="empleado")
	private String sempleado;
	
	@NotNull(message = "Este campo es requerido!!!!")
	@Column(name="edad")
	private Integer iedad;
	
	@NotNull(message = "Este campo es requerido!!!!")
	@Column(name="genero")
	private String sgenero;
	
	@NotNull(message = "Este campo es requerido!!!!")
	@Column(name="estado")
	private String bestado;
	
	//@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "id_sucursalpk")
	private Integer idsucursal;
	
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String nombre,Integer edad,String genero,String estado,Integer sucursal) {
		// TODO Auto-generated constructor stub
		this.sempleado = nombre;
		this.iedad = edad;
		this.sgenero = genero;
		this.bestado = estado;
		this.idsucursal = sucursal;
	}
	
	
	
	
	
	public void setIdempleado(Integer idempleado) {
		this.idempleado = idempleado;
	}
	
	public void setSempleado(String snombre) {
		this.sempleado = snombre;
	}
	
	public void setIedad(Integer iedad) {
		this.iedad = iedad;
	}
	
	public void setSgenero(String sgenero) {
		this.sgenero = sgenero;
	}
	
	public void setBestado(String bestado) {
		this.bestado = bestado;
	}
	
	public void setIdsucursal(Integer idsucursal) {
		this.idsucursal = idsucursal;
	}
	
	
	
	public Integer getIdempleado() {
		return idempleado;
	}
	
	public String getSempleado() {
		return sempleado;
	}
	
	public Integer getIedad() {
		return iedad;
	}
	
	public String getSgenero() {
		return sgenero;
	}
	
	public String getBestado() {
		return bestado;
	}
	
	public Integer getIdsucursal() {
		return idsucursal;
	}
	
	
	
	
	
}
