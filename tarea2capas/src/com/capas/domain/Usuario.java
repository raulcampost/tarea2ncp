package com.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public",name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(generator="usuario_id_usuario_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "usuario_id_usuario_seq", sequenceName = "public.usuario_id_usuario_seq")
	@Column(name="id_usuario")
	private Integer idusuario;
	
	@Column(name="usuario")
	private String susuario;
	
	@Column(name="clave")
	private String sclave;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String user,String pass) {
		// TODO Auto-generated constructor stub
		susuario = user;
		sclave = pass;
	}
	
	public Usuario(Integer id,String user,String pass) {
		// TODO Auto-generated constructor stub
		idusuario = id;
		susuario = user;
		sclave = pass;
	}
	
	
	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}
	
	public void setSusuario(String susuario) {
		this.susuario = susuario;
	}
	
	public void setSclave(String sclave) {
		this.sclave = sclave;
	}
	
	
	public Integer getIdusuario() {
		return idusuario;
	}
	
	public String getSusuario() {
		return susuario;
	}
	
	public String getSclave() {
		return sclave;
	}
	
	
	
}
