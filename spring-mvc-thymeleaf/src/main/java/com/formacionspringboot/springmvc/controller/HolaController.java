package com.formacionspringboot.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HolaController {
	
	@GetMapping("/saludar")
	public String saludar() {
		return "hola";
	}

}
