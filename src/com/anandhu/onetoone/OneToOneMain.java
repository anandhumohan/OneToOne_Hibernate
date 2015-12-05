package com.anandhu.onetoone;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class OneToOneMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("Hiberante.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

	}
}
