package tn.esprit.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Parent {
	@Id
	private int id;

	public Parent(int id) {
		
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//@JsonBackReference
	@OneToOne(mappedBy="Parent")
	private User user; 
}
