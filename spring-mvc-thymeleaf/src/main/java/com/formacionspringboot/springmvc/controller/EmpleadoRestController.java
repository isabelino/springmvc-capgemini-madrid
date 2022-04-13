package com.formacionspringboot.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionspringboot.springmvc.entity.Empleado;
import com.formacionspringboot.springmvc.service.EmpleadoService;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

	@Autowired
	private EmpleadoService servicio;
	
	@GetMapping("/empleados")
	public List<Empleado> mostrarEmpleados(){
		return servicio.listarEmpleados();
	}
	
	
	
}
