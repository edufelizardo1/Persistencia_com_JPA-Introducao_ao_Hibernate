package loja.dao;

import javax.persistence.EntityManager;

import loja.modelo.Produto;

public class ProdutoDao {
	private EntityManager  entityManager;

	public ProdutoDao(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	public void cadastrar(Produto produto) {
		this.entityManager.persist(produto);
	}

}
