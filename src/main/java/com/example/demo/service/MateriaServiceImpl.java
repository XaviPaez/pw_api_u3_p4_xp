package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.modelo.Materia;

@Service
	public class MateriaServiceImpl implements IMateriaService{

		@Autowired
		private IMateriaRepository iMateriaRepository;

		@Override
		public Materia consultarPorIdentificador(String identificador) {
			// TODO Auto-generated method stub
			return this.iMateriaRepository.buscarPorIdentificador(identificador);
		}

		@Override
		public void guardar(Materia materia) {
			// TODO Auto-generated method stub
			this.iMateriaRepository.insertar(materia);
		}

		@Override
		public void actualizar(Materia materia) {
			// TODO Auto-generated method stub
			this.iMateriaRepository.actualizar(materia);
		}

		@Override
		public void borrar(Integer id) {
			// TODO Auto-generated method stub
			this.iMateriaRepository.borrar(id);
		}

		@Override
		public List<Materia> consutarTodos() {
			// TODO Auto-generated method stub
			return this.iMateriaRepository.buscarTodos();
		}

	


}
