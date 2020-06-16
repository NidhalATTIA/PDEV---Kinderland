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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Kindergarden implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdKindergarden;

	private String Title;

	private String Adress;

	private String Tel;

	private Date CreationDate;
	
	private String worktime;
	
	private Integer NumberEmployee;

	private String Logo;
	@Column(name = "cost")
	private float Cost;

	@OneToOne
	private Planning planning; 
	
	@OneToOne
	private Director director;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Event> Events;
	/*
	@OneToMany(cascade = CascadeType.ALL, mappedBy="kindergardens")
	private Set<Teacher> Teachers;
	*/
	public Long getIdKindergarden() {
		return IdKindergarden;
	}

	public void setIdKindergarden(Long idKindergarden) {
		IdKindergarden = idKindergarden;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public Date getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}

	public Integer getNumberEmployee() {
		return NumberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		NumberEmployee = numberEmployee;
	}

	public String getLogo() {
		return Logo;
	}

	public void setLogo(String logo) {
		Logo = logo;
	}

	public float getCost() {
		return Cost;
	}

	public void setCost(float cost) {
		Cost = cost;
	}
	

	public String getWorktime() {
		return worktime;
	}

	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}

	public Planning getPlanning() {
		return planning;
	}

	public void setPlanning(Planning planning) {
		this.planning = planning;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public Set<Event> getEvents() {
		return Events;
	}

	public void setEvents(Set<Event> events) {
		Events = events;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		NumberEmployee = numberEmployee;
	}

	@Override
	public String toString() {
		return "Kindergarden [IdKindergarden=" + IdKindergarden + ", Title=" + Title + ", Adress=" + Adress + ", Tel="
				+ Tel + ", CreationDate=" + CreationDate + ", NumberEmployee=" + NumberEmployee + ", Logo=" + Logo
				+ ", Cost=" + Cost + "]";
	}

	public Kindergarden() {
		super();
	}

	public Kindergarden(Long idKindergarden, String title, String adress, String tel, Date creationDate,
			String worktime, Integer numberEmployee, String logo, float cost, Planning planning, Director director,
			Set<Event> events) {
		super();
		IdKindergarden = idKindergarden;
		Title = title;
		Adress = adress;
		Tel = tel;
		CreationDate = creationDate;
		this.worktime = worktime;
		NumberEmployee = numberEmployee;
		Logo = logo;
		Cost = cost;
		this.planning = planning;
		this.director = director;
		Events = events;
	}

	public Kindergarden(String title, String adress) {
		super();
		Title = title;
		Adress = adress;
	}
	

	public Kindergarden(Long idKindergarden, String title, String adress, String tel, Date creationDate,
			String worktime, Integer numberEmployee, float cost) {
		super();
		IdKindergarden = idKindergarden;
		Title = title;
		Adress = adress;
		Tel = tel;
		CreationDate = creationDate;
		this.worktime = worktime;
		NumberEmployee = numberEmployee;
		Cost = cost;
	}

	public Kindergarden(String title, String adress, String tel, Date creationDate, String worktime,
			Integer numberEmployee, float cost) {
		super();
		Title = title;
		Adress = adress;
		Tel = tel;
		CreationDate = creationDate;
		this.worktime = worktime;
		NumberEmployee = numberEmployee;
		Cost = cost;
	}
	

}
