package com.formacionspringboot.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.formacionspringboot.springmvc.entity.Empleado;
import com.formacionspringboot.springmvc.service.EmpleadoService;

@Controller
public class EmpleadoController {

	@Autowired
	private EmpleadoService servicio;
	
	@GetMapping("/empleados")
	public String listarEmpleado(Model modelo) {
		
		modelo.addAttribute("datos",servicio.listarEmpleados());
		return "empleado";
	}
	
	@GetMapping("/empleados/nuevo")
	public String formularioEmpleado(Model modelo) {
		Empleado empleado = new Empleado();
		modelo.addAttribute("empleado",empleado);
		return "nuevo_empleado";
	}
	
	@PostMapping("/empleados")
	public String guardarEmpleado(@ModelAttribute("empleado") Empleado empleado) {
		servicio.guardarEmpleado(empleado);
		return "redirect:/empleados";
	}
	
	@GetMapping("/empleados/{id}")
	public String formularioEditarEmpleado(@PathVariable long id,Model modelo) {
		Empleado objEmpleado = servicio.obtenerEmpleado(id);
		modelo.addAttribute("empleadoEditar",objEmpleado);
		return "editar_empleado";
	}
	
	@PostMapping("/empleados/actualizar/{id}")
	public String actualizarEmpleado(@PathVariable long id, @ModelAttribute("empleadoEditar") Empleado empleado) {
		
		Empleado empleadoExistente = servicio.obtenerEmpleado(id);
		
		empleadoExistente.setId(id);
		empleadoExistente.setNombre(empleado.getNombre());
		empleadoExistente.setApellido(empleado.getNombre());
		empleadoExistente.setEmail(empleado.getEmail());
		empleadoExistente.setTelefono(empleado.getTelefono());
		
		servicio.guardarEmpleado(empleadoExistente);
		
		return "redirect:/empleados";
		
	}
	
	@PostMapping("/empleados/eliminar/{id}")
	public String eliminarEmpleado(@PathVariable long id) {
		servicio.eliminarEmpleado(id);
		return "redirect:/empleados";
	}
	
	
	
}
