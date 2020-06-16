package tn.esprit.spring.entity;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;





@Entity
public class Event implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7289356299308988091L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvent;

	private String Titleevent;
	
	private Date DateEvent;
	private String DescriptionEvent;

	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getTitleevent() {
		return Titleevent;
	}

	public void setTitleevent(String titleevent) {
		Titleevent = titleevent;
	}

	

	public Date getDateEvent() {
		return DateEvent;
	}

	public void setDateEvent(Date dateEvent) {
		DateEvent = dateEvent;
	}

	public String getDescriptionEvent() {
		return DescriptionEvent;
	}

	public void setDescriptionEvent(String descriptionEvent) {
		DescriptionEvent = descriptionEvent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Event() {
		super();
	}

	public Event(int idEvent, String titleevent, Date dateEvent, String descriptionEvent, User user) {
		super();
		this.idEvent = idEvent;
		Titleevent = titleevent;
		DateEvent = dateEvent;
		DescriptionEvent = descriptionEvent;
		this.user = user;
	}
	@ManyToOne
	private User user;

	@Override
	public String toString() {
		return "Event [idEvent=" + idEvent + ", Titleevent=" + Titleevent + ", DateEvent=" + DateEvent
				+ ", DescriptionEvent=" + DescriptionEvent + ", user=" + user + "]";
	}

	

}
