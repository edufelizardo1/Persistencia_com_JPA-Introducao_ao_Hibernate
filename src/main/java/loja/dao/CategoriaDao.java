package loja.dao;

import javax.persistence.EntityManager;

import loja.modelo.Categoria;

public class CategoriaDao {
	private EntityManager  entityManager;

	public CategoriaDao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	public void cadastrar(Categoria categoria) {
		this.entityManager.persist(categoria);
	}

}
