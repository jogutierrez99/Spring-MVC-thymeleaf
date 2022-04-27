package com.formacionspringboot.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.formacionspringboot.springmvc.service.EmpleadoService;

@Controller
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService servicio;
	
	@GetMapping("/empleados")
	public String listarempleados(Model modelo) {
		String saludar ="Hola desde el controlador";
		
		modelo.addAttribute("datos",servicio.listaEmpleados());
		return "empleado";
	}
	
	@GetMapping("/empleados/nuevo")
	public String formularioEmpleado() {
		return "nuevo_empleado";
	}

}
