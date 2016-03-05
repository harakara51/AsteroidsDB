package entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class main
{
	public static void main(String[] args)
	{ 
		System.out.println("in main");
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("asteroids");
		System.out.println("after Factory");
		EntityManager em = emf.createEntityManager();

		
		Asteroid temp =em.find(Asteroid.class, 1);
		
//		TypedQuery<Asteroids> query =
//			      em.createNamedQuery("Country.findAll", Asteroid.class);
		Query query = em.createNamedQuery("select a from Asteroid a");
		  List results = query.getResultList();
		System.out.println(temp);
//		System.out.println("OBj found+ " + temp.getDate());


	}
}
