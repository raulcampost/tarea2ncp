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
import javax.validation.constraints.NotNull;


@Entity
@Table(schema="public",name="sucursal")
public class Sucursal {

	@Id
	@GeneratedValue(generator="sucursal_id_sucursal_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_id_sucursal_seq", sequenceName = "public.sucursal_id_sucursal_seq")
	@Column(name="id_sucursal")
	private Integer idsucursal;
	
	
	@NotNull(message = "Este campo es requerido!!!!")
	@Column(name="nombre")
	private String snombre;	
	
	@NotNull(message = "Este campo es requerido!!!!")
	@Column(name="ubicacion")
	private String subicacion;
	
	@NotNull(message = "Este campo es requerido!!!!")
	@Column(name="hentrada")
	private String sentrada;	
	
	@NotNull(message = "Este campo es requerido!!!!")
	@Column(name="hsalida")
	private String ssalida;	
	
	@NotNull(message = "Este campo es requerido!!!!")
	@Column(name="mesas")
	private Integer inmesas;	
	
	@NotNull(message = "Este campo es requerido!!!!")
	@Column(name="gerente")
	private String sgerente;	
	
	
	@OneToMany(mappedBy = "idsucursal", fetch = FetchType.LAZY)
	private List<Empleado> empleados;
	
	
	public Sucursal() {
		// TODO Auto-generated constructor stub
	}
	
	public Sucursal(String nombre,String ubicacion,String entrada,String salida,Integer mesas,String gerente) {
		// TODO Auto-generated constructor stub
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
