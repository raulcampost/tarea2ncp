package com.capas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capas.dao.UsuarioDao;
import com.capas.domain.Empleado;
import com.capas.domain.Sucursal;
import com.capas.domain.Usuario;
import com.capas.dto.FormDTO;
import com.capas.repositories.EmpleadoRepositorio;
import com.capas.repositories.UsuarioRepositorio;


@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired(required=true)
	public UsuarioDao ud;
	
	@Autowired(required=true)
	UsuarioRepositorio ur;
	
	@Autowired(required=true)
	EmpleadoRepositorio er;
	
	@Override
	public List<Empleado> find(Integer user){
		// TODO Auto-generated method stub
		return ud.find(user);
	}

	@Override
	public List<Sucursal> findsucursal(){
		// TODO Auto-generated method stub
		return ud.findsucursal();
	}

	@Override
	public Sucursal findsucursalone(Integer id){
		// TODO Auto-generated method stub
		return ur.findById(id).get();
	}

	@Transactional
	public void deletempleado(Sucursal id) {
		// TODO Auto-generated method stub
		ur.delete(id);
	}



	@Override
	public Sucursal findone(Integer user){
		// TODO Auto-generated method stub
		return ur.findById(user).get();
	}

	@Transactional
	public Integer deletempleados(Integer id) {
		// TODO Auto-generated method stub
			return ud.deletempleado(id);

		
	}

	@Transactional
	public Sucursal savesucursal(Sucursal s) {
		// TODO Auto-generated method stub
		return ur.save(s);
	}

	@Transactional
	public Empleado savempleado(Empleado s) {
		// TODO Auto-generated method stub
		return er.save(s);
	}

	
}
