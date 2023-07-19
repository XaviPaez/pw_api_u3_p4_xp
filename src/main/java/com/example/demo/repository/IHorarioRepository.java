package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Horario;

public interface IHorarioRepository {


	public void insertar(Horario horario);

	public Horario buscarPorId(Integer id);

	public Horario seleccionarPorCodigo(String codigo);

	public void actualizar(Horario horario);

	public void eliminar(Integer id);

	public List<Horario> buscarTodos();



}
