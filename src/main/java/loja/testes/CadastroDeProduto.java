package loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import loja.modelo.Produto;

public class CadastroDeProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto celular = new Produto();
		celular.setNome("Xiomi Readme");
		celular.setDescricao("Muito legal");
		celular.setPreco(new BigDecimal("800"));
		
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("loja");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(celular);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
