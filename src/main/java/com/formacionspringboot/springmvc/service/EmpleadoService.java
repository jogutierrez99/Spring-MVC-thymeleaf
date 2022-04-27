package com.formacionspringboot.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.formacionspringboot.springmvc.entity.Empleado;


public interface EmpleadoService {
	
	public List<Empleado> listaEmpleados();
	
}
