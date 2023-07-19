package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Horario;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IHorarioService;


@RestController
@RequestMapping("/horarios")
public class HorarioControllerRestFul {

	
	@Autowired
	private IHorarioService iHorarioService;
	

	@GetMapping(path = "/{codigo}")
	public Horario consultarPorCodigo(@PathVariable String codigo) {
		return this.iHorarioService.consultarPorCodigo(codigo);
	}

	@PostMapping
	public void guardar(@RequestBody Horario horario) {
		this.iHorarioService.guardar(horario);
	}

	@PutMapping(path = "/{identificador}")
	public void actualizar(@RequestBody Horario horario, @PathVariable Integer identificador) {

		horario.setId(identificador);
		this.iHorarioService.actualizar(horario);
	}

	@PatchMapping(path = "/{identificador}")

	public void actualizarParcial(@RequestBody Horario horario, @PathVariable Integer identificador) {
		Horario horario2 = this.iHorarioService.buscarPorId(identificador);
		horario2.setDocente(horario.getDocente());

		this.iHorarioService.actualizar(horario2);
	}

	@DeleteMapping(path = "/{id}")
	public void borrar(@PathVariable Integer id) {
		this.iHorarioService.eliminar(id);
	}


	@GetMapping(path = "/buscarTodos")
	public List<Horario> buscarTodos(){
		return this.iHorarioService.buscarTodos();
	

	}
}