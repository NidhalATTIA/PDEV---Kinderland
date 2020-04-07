package tn.esprit.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Admin  {
	@Id
	private int id;

	public Admin(int id) {
		
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//@JsonBackReference
	@OneToOne(mappedBy="Admin")
	private User user; 
}
