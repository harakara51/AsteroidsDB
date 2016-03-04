package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class main
{
	public static void main(String[] args)
	{ 
		System.out.println("in main");
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("asteroids");
		System.out.println("after Factory");
		EntityManager em = emf.createEntityManager();

		
		Asteroid temp =em.find(Asteroid.class, 1);
		
		System.out.println(temp);
//		System.out.println("OBj found+ " + temp.getDate());


	}
}
