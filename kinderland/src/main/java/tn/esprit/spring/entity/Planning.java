package tn.esprit.spring.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Planning {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdPlanning;
	
	private Date Dateplanning;
	private String Content;
	private String Session ;

	public int getIdPlanning() {
		return IdPlanning;
	}

	public void setIdPlanning(int idPlanning) {
		IdPlanning = idPlanning;
	}

	

	public String getSession() {
		return Session;
	}

	public void setSession(String session) {
		Session = session;
	}

	
	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
	public Date getDateplanning() {
		return Dateplanning;
	}

	public void setDateplanning(Date dateplanning) {
		Dateplanning = dateplanning;
	}

	@ManyToOne
	private User user;
	
	
	
	public Planning() {
		super();
	}

	
	public Planning(int idPlanning,  String session, String content,Date dateplanning,User user) {
		super();
		IdPlanning = idPlanning;
		Session = session;
		Content=content;
		Dateplanning = dateplanning;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Planning [IdPlanning=" + IdPlanning + ", Content="+ Content +" , Dateplanning=" + Dateplanning + ", Session=" + Session + "]";
	}
	
 
}

