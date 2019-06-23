package com.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capas.domain.Empleado;
import com.capas.domain.Sucursal;
import com.capas.domain.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Sucursal,Integer>{
	

}
