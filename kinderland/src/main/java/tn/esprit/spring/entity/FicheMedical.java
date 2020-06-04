package tn.esprit.spring.entity;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;

@Entity
public class FicheMedical implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idfiche;

	@Column(name = "Sexe")
	private String sexe;

	@Column(name = "Taille")
	private int taille;

	@Column(name = "Poids")
	private int poids;
	@Column(name = "Maladie_Chronique")
	private boolean MaladieChronique;
	@Column(name = "noteMedecin")
	private String contenu;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User nurse;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Child child;

	public long getIdfiche() {
		return idfiche;
	}

	public void setIdfiche(long idfiche) {
		this.idfiche = idfiche;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public User getNurse() {
		return nurse;
	}

	public void setNurse(User nurse) {
		this.nurse = nurse;
	}

	@Override
	public String toString() {
		return "FicheMedical [idfiche=" + idfiche + ", contenu=" + contenu + ", nurse=" + nurse + "]";
	}
}
