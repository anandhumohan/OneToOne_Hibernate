package com.anandhu.onetoone;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class OneToOneMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("Hiberante.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Country country1 = new Country();
		country1.setCountryName("india");
		country1.setPopulation(1000);
		Capital capital1 = new Capital();
		capital1.setCapitalName("delhi");
		capital1.setCapitalPopulation(500);
		country1.setCapital(capital1);

		Country country2 = new Country();
		country2.setCountryName("Srilanka");
		country2.setPopulation(2000);
		Capital capital2 = new Capital();
		capital2.setCapitalName("columbo");
		capital2.setCapitalPopulation(1000);
		country2.setCapital(capital2);

		Transaction transaction = session.beginTransaction();
		session.save(country1);
		session.save(capital2);
		session.save(country2);
		session.save(capital2);
		System.out.println("updated");
		transaction.commit();
		session.close();
		factory.close();

	}
}
