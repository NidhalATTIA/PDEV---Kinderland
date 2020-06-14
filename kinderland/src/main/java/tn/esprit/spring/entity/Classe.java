package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Classe implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  Long id;
	private String nom;
	private int capacitie;
	
	
	@JsonIgnore
	@ManyToOne
	private Kindergarden  kindergarden;
	
	@JsonIgnore
	 @Transient 
	@OneToMany(cascade = CascadeType.ALL, mappedBy="classe",fetch=FetchType.EAGER)
	private Collection<Child> kid= new ArrayList<>();
	
	@JsonIgnore
	@OneToOne(mappedBy="classe")
	private Teacher teacher;
	
	public Classe() {
		super();
	}
	public Classe(Long id, String nom, int capacitie) {
		super();
		this.id = id;
		this.nom = nom;
		this.capacitie = capacitie;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCapacitie() {
		return capacitie;
	}
	public void setCapacitie(int capacitie) {
		this.capacitie = capacitie;
	}
	public Kindergarden getKindergarden() {
		return kindergarden;
	}
	public void setKindergarden(Kindergarden kindergarden) {
		this.kindergarden = kindergarden;
	}
	public Collection<Child> getKid() {
		return kid;
	}
	public void setKid(Collection<Child> kid) {
		this.kid = kid;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
