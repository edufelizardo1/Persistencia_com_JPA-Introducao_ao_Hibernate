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
	
	public void atualizar(Categoria categoria) {
		this.entityManager.merge(categoria);
	}
	
	public void remover(Categoria categoria) {
		categoria = entityManager.merge(categoria);
		this.entityManager.remove(categoria);
	}

}
