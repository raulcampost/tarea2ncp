package com.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.capas.domain.Empleado;
import com.capas.domain.Sucursal;
import com.capas.domain.Usuario;

public interface UsuarioDao {

	public List<Empleado> find(Integer id) throws DataAccessException;
	public Integer deletempleado(Integer id) throws DataAccessException;
	public List<Sucursal> findsucursal() throws DataAccessException;
	public List<Sucursal> findsucursalone(Integer id) throws DataAccessException;
	public List<Sucursal> deletesucursal(Integer id) throws DataAccessException;
	
}
