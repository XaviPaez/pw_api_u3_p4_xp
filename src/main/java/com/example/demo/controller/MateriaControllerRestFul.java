package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/actualizar/{identificador}")
	public void actualizar(@RequestBody Materia materia, @PathVariable Integer identificador ) {
		
		materia.setId(identificador);
		this.materiaService.actualizar(materia);
	}
	
	@DeleteMapping(path = "/borrar/{id}")
	public void borrar(@PathVariable Integer id) {
		this.materiaService.borrar(id);
	}
	
	@GetMapping(path = "/buscarTodos")
	public List<Materia> consultarTodos() {
		return this.materiaService.consutarTodos();
	}
	

}
