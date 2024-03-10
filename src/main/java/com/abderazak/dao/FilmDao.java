package com.abderazak.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.abderazak.entities.Film;
import com.abderazak.util.JPAutil;

public class FilmDao {
	private EntityManager entityManager = JPAutil.getEntityManager("MonProjetJPA_Film");

	public void ajouter(Film f) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(f);
		tx.commit();
	}

	// méthode modifier d'une entité à partir de la bd
	public void modifier(Film f) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(f);
		tx.commit();
	}

	// méthode Supprimer d'une entité à partir de la bd
	public void supprimer(Film f) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		f = entityManager.merge(f); // important
		entityManager.remove(f);
		tx.commit();
	}

	// méthode Consulter d'une entité à partir de la bd
	public Film consulter(Film f, Object id) {
		return entityManager.find(f.getClass(),id);
	}

	// méthode pour lister tous les objets à partir de la bd
	public List<Film> listerTous() {
		List<Film> films = entityManager.createQuery("select f from Film f").getResultList();
		return films;
	}

	// méthode pour lister tous les client dont le nom contient un
	// texte donné en paramètre (pnom)
	public List<Film> listerParNom(String nomFilm) {
		List<Film> films = entityManager.createQuery("select f from Film f where f.nomFilm like :pnom").setParameter("pnom", "%" + nomFilm + "%").getResultList();
		return films;
	}
}
