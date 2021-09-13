package loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import loja.dao.ProdutoDao;
import loja.modelo.Produto;
import loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto celular = new Produto();
		celular.setNome("Xiomi Readme");
		celular.setDescricao("Muito legal");
		celular.setPreco(new BigDecimal("800"));
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(entityManager);
		
		entityManager.getTransaction().begin();
		produtoDao.cadastrar(celular);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
