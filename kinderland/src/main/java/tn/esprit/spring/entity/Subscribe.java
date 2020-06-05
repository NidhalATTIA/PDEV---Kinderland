package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Subscribe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdSubscribe;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	User iduser;
	
	
	@ManyToOne(cascade = CascadeType.MERGE)
	
	Kindergarden idkindergarden; 
	
	
	@Override
	public String toString() {
		return "Subscribe [IdSubscribe=" + IdSubscribe + ", iduser=" + iduser + ", idkindergarden=" + idkindergarden
				+ "]";
	}



	public Long getIdSubscribe() {
		return IdSubscribe;
	}

	public void setIdSubscribe(Long idSubscribe) {
		IdSubscribe = idSubscribe;
	}



	public User getIduser() {
		return iduser;
	}



	public void setIduser(User iduser) {
		this.iduser = iduser;
	}



	public Kindergarden getIdkindergarden() {
		return idkindergarden;
	}



	public void setIdkindergarden(Kindergarden idkindergarden) {
		this.idkindergarden = idkindergarden;
	}


	

}