package com.example.demo.repository;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {
	
	public Materia buscarPorIdentificador(String identificador);

	public void insertar(Materia materia);

}
