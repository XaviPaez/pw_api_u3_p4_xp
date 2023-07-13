package com.example.demo.service;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaService {
	

	public Materia consultarPorIdentificador(String identificador);

	public void guardar(Materia materia);


}
