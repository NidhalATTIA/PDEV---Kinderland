package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Nurse  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idNurse;

	
	//@JsonBackReference
	@OneToOne(mappedBy="nurse")
	private User user;


	public int getIdNurse() {
		return idNurse;
	}


	public void setIdNurse(int idNurse) {
		this.idNurse = idNurse;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
}
