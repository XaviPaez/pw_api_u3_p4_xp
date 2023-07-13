package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class MateriaRepositoryImpl implements IMateriaRepository {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public Materia buscarPorIdentificador(String identificador) {
		// TODO Auto-generated method stub
		TypedQuery<Materia> myQuery = this.entityManager
				.createQuery("SELECT m FROM Materia m WHERE m.identificador= :datoIdentificador", Materia.class);
	
		myQuery.setParameter("datoIdentificador", identificador);
		return myQuery.getSingleResult();
	}

	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(materia);
	}

}
