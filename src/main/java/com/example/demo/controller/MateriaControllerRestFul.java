package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IMateriaService;

@RestController
@RequestMapping("/materias")
public class MateriaControllerRestFul {
	
	//Materia
	@Autowired
	private IMateriaService materiaService;
	
	//MATERIA
	
	@GetMapping("/buscar")
	public Materia consultarPorIdentificador() {
		String identificador="001";
		return this.materiaService.consultarPorIdentificador(identificador);
	}

	@PostMapping("/guardar")
	public void guardar(@RequestBody Materia materia) {
		this.materiaService.guardar(materia);
	}
	
	

}
