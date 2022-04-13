package com.formacionspringboot.springmvc.service;

import java.util.List;

import com.formacionspringboot.springmvc.entity.Empleado;

public interface EmpleadoService {

	public List<Empleado> listarEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado obtenerEmpleado(long id);
	
	public void eliminarEmpleado(long id);
}
