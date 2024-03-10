package com.abderazak.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Film implements Serializable{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int idFilm;
	private String nomFilm;
	private float rateFilm;
	private String genreFilm;
	public int getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}
	public String getNomFilm() {
		return nomFilm;
	}
	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}
	public float getRateFilm() {
		return rateFilm;
	}
	public void setRateFilm(float rateFilm) {
		this.rateFilm = rateFilm;
	}
	public String getGenreFilm() {
		return genreFilm;
	}
	public void setGenreFilm(String genreFilm) {
		this.genreFilm = genreFilm;
	}
	
}
