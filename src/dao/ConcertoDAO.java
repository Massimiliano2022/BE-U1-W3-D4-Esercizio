package dao;

import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import app.Application;
import entities.Concerto;

public class ConcertoDAO {

	private static Logger logger = LoggerFactory.getLogger(Application.class);
	private final EntityManager em;

	public ConcertoDAO(EntityManager em) {
		this.em = em;
	}

	public void save(Concerto c) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(c);
		transaction.commit();
		logger.info("Concerto salvato " + c.toString());
	}

	public Concerto getById(UUID id) {
		Concerto found = em.find(Concerto.class, id);
		return found;
	}

	public List<Concerto> getConcertiInStreaming() {
		TypedQuery<Concerto> query = em.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming = 'true'",
				Concerto.class);

		return query.getResultList();
	}

	/*
	 * public List<Concerto> getConcertiPerGenere() { TypedQuery<Concerto> query =
	 * em.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming",
	 * Concerto.class);
	 * 
	 * return query.getResultList(); }
	 */

}
