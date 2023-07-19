package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {
	
	public Materia buscarPorIdentificador(String identificador);

	public void insertar(Materia materia);
	
	public void actualizar(Materia materia);
	
	public void borrar(Integer id);
	
	public Materia buscarPorId(Integer id);
	
	public List<Materia> buscarTodos();

}
