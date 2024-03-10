package com.abderazak.test;

import com.abderazak.dao.FilmDao;
import com.abderazak.entities.Film;

public class FilmTest {
	public static void main(String[] args) {
		Film f = new Film();
		f.setNomFilm("AKA");
		f.setGenreFilm("comedie");
		f.setRateFilm(2);
		//ajouter l'objet client à la BD
		FilmDao cltDao = new FilmDao();
		cltDao.ajouter(f);
		System.out.println("Appel de la méthode listerTous");
		for (Film cl : cltDao.listerTous())
		System.out.println(cl.getIdFilm()+" "+cl.getNomFilm());
		System.out.println("Appel de la méthode listerParNom");
		for (Film cl : cltDao.listerParNom("a"))

		System.out.println(cl.getIdFilm()+" "+cl.getNomFilm());

		//tester les autres méthodes de la classe ClientDao
		
	}
}
