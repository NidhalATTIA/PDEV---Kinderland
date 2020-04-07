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
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdUser;

	@Column(name = "firstName")
	private String FirstName;

	@Column(name = "LastName")
	private String LastName;

	/*
	 * @Enumerated(EnumType.STRING) Role role;
	 */

	@Column(name = "Phone")
	private int Phone;

	@Column(name = "Mail")
	private String Mail;

	@Column(name = "BirthDate")
	private String BDate;
	
	@Column(name = "Etat")
	private String Etat;
	
	//@JsonBackReference
	@OneToOne
	private Admin Admin;
	
	@OneToOne
	private Director director;
	
	@OneToOne
	private Teacher teacher;
	
	@OneToOne
	private Parent parent;
	
	@OneToOne
	private Nurse nurse;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<ForumPost> forumPost;

	// -------------------------------------------------------- Getters and Setters --------------------------------------------------

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}

	public long getIdUser() {
		return IdUser;
	}

	public void setIdUser(long idUser) {
		this.IdUser = idUser;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getBDate() {
		return BDate;
	}

	public void setBDate(String bDate) {
		BDate = bDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

// ---------------------------------------------------- ToString ---------------------------------------------------------------

	@Override
	public String toString() {
		return "User [idUser=" + IdUser + ", firstName=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone
				+ ", Mail=" + Mail + ", BDate=" + BDate + "]";
	}
	
}
