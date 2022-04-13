package com.formacionspringboot.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspringboot.springmvc.dao.EmpleadoDao;
import com.formacionspringboot.springmvc.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoDao empleadoDao;
	
	
	@Override
	public List<Empleado> listarEmpleados() {
		return empleadoDao.findAll();
	}


	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return empleadoDao.save(empleado);
	}


	@Override
	public Empleado obtenerEmpleado(long id) {
		return empleadoDao.findById(id).get();
	}


	@Override
	public void eliminarEmpleado(long id) {
		empleadoDao.deleteById(id);
		
	}

}
