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

@Entity
@Table(schema="public",name="empleado")
public class Empleado {

	@Id
	@GeneratedValue(generator="empleado_sec", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "empleado_sec", sequenceName = "public.empleado_sec")
	@Column(name="id_empleado")
	private Integer idempleado;
	
	@Column(name="nombre")
	private String snombre;
	
	@Column(name="edad")
	private Integer iedad;
	
	
	@Column(name="genero")
	private String sgenero;
	
	@Column(name="estado")
	private String bestado;
	
	//@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "id_sucursalpk")
	private Integer idsucursal;
	
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(Integer id,String nombre,Integer edad,String genero,String estado,Integer idsucursal) {
		// TODO Auto-generated constructor stub
		this.idempleado = id;
		this.snombre = nombre;
		this.iedad = edad;
		this.sgenero = genero;
		this.bestado = estado;
		this.idsucursal = idsucursal;
	}
	
	
	
	
	public void setIdempleado(Integer idempleado) {
		this.idempleado = idempleado;
	}
	
	public void setSnombre(String snombre) {
		this.snombre = snombre;
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
	
	public String getSnombre() {
		return snombre;
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
