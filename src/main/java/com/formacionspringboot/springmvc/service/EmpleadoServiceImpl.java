package com.formacionspringboot.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionspringboot.springmvc.dao.EmpleadoDao;
import com.formacionspringboot.springmvc.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	public EmpleadoDao empleadoDao;
	
	@Override
	public List<Empleado> listaEmpleados() {
		// TODO Auto-generated method stub
		return empleadoDao.findAll();
	}

}
