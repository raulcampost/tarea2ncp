package com.capas.services;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.capas.domain.Empleado;
import com.capas.domain.Sucursal;
import com.capas.domain.Usuario;
import com.capas.dto.FormDTO;

public interface UsuarioService {

	public List<Empleado> find(Integer user);
	public Empleado savempleado(Empleado s);
	public Sucursal findone(Integer user);
	public void deletempleado(Sucursal id);
	public Integer deletempleados(Integer id);
	public List<Sucursal> findsucursal();
	public Sucursal findsucursalone(Integer id);
	public Sucursal savesucursal(Sucursal s);
}
