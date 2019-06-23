package com.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(schema="public",name="sucursal")
public class Sucursal {

	@Id
	@GeneratedValue(generator="sucursal_sec", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_sec", sequenceName = "public.sucursal_sec")
	@Column(name="id_sucursal")
	private Integer idsucursal;
	
	@Column(name="nombre")
	private String snombre;	
	
	@Column(name="ubicacion")
	private String subicacion;
	
	@Column(name="hentrada")
	private String sentrada;	
	
	@Column(name="hsalida")
	private String ssalida;	
	
	@Column(name="mesas")
	private Integer inmesas;	
	
	@Column(name="gerente")
	private String sgerente;	
	
	
	@OneToMany(mappedBy = "idsucursal", fetch = FetchType.LAZY)
	private List<Empleado> empleados;
	
	
	public Sucursal() {
		// TODO Auto-generated constructor stub
	}
	
	public Sucursal(Integer id,String nombre,String ubicacion,String entrada,String salida,Integer mesas,String gerente) {
		// TODO Auto-generated constructor stub
		this.idsucursal = id;
		this.snombre = nombre;
		this.subicacion = ubicacion;
		this.sentrada = entrada;
		this.ssalida = salida;
		this.inmesas = mesas;
		this.sgerente = gerente;
		
	}
	
	
	public void setIdsucursal(Integer idsucursal) {
		this.idsucursal = idsucursal;
	}
	
	public void setSnombre(String snombre) {
		this.snombre = snombre;
	}
	
	public void setSubicacion(String subicacion) {
		this.subicacion = subicacion;
	}
	
	public void setSentrada(String sentrada) {
		this.sentrada = sentrada;
	}
	
	public void setSsalida(String ssalida) {
		this.ssalida = ssalida;
	}
	public void setInmesas(Integer inmesas) {
		this.inmesas = inmesas;
	}
	
	public void setSgerente(String sgerente) {
		this.sgerente = sgerente;
	}
	
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
	
	public Integer getIdsucursal() {
		return idsucursal;
	}
	
	public String getSnombre() {
		return snombre;
	}
	
	public String getSubicacion() {
		return subicacion;
	}
	
	public String getSentrada() {
		return sentrada;
	}
	
	public String getSsalida() {
		return ssalida;
	}
	
	public Integer getInmesas() {
		return inmesas;
	}
	
	public String getSgerente() {
		return sgerente;
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	
	
	
	
}
