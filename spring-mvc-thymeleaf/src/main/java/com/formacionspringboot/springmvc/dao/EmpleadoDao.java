package com.formacionspringboot.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formacionspringboot.springmvc.entity.Empleado;

@Repository
public interface EmpleadoDao extends JpaRepository<Empleado, Long>{

}
