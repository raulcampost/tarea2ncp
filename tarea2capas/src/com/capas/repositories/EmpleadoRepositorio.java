package com.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capas.domain.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer> {

}
