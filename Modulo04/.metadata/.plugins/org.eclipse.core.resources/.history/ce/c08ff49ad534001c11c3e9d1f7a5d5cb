package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Produto;

public class Principal {
	
	public static void main (String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Alfaloja-PU");
		EntityManager em = emf.createEntityManager();
		
		//Buscar um produto do banco de dados.
		Produto objpro = em.find(Produto.class, 3);
		System.out.println(objpro.getNome());
		em.close();
		emf.close();
	}
}
