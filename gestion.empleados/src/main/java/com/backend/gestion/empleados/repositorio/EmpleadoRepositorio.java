package com.backend.gestion.empleados.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.gestion.empleados.modelo.Empleado;

//@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{

}
