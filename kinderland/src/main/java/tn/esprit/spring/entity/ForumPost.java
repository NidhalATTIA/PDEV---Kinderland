package tn.esprit.spring.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ForumPost implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdPost;

	@Column(name = "IdUser")
	private int IdUser;

	@Column(name = "TitlePost")
	private String TitlePost;

	@Column(name = "DatePost")
	private Date DatePost;


	@Column(name = "TextPost")
	private String TextPost;

	@Column(name = "ImagePost")
	private String ImagePost;
	
	@Column(name = "CategoryPost")
	private String CategoryPost;
	
	@Column(name = "Pinned")
	private Boolean Pinned;
	
	@ManyToOne(cascade = CascadeType.ALL)
	User user;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<ForumPostComment> forumPostComment;

	// -------------------------------------------------------- Getters and Setters ------------------------------------------------
	
	public long getIdPost() {
		return IdPost;
	}

	public void setIdPost(long idPost) {
		IdPost = idPost;
	}

	public int getIdUser() {
		return IdUser;
	}

	public void setIdUser(int idUser) {
		IdUser = idUser;
	}

	public String getTitlePost() {
		return TitlePost;
	}

	public void setTitlePost(String titlePost) {
		TitlePost = titlePost;
	}

	
	public Date getDatePost() {
		return DatePost;
	}

	public void setDatePost(Date datePost) {
		DatePost = datePost;
	}

	public String getTextPost() {
		return TextPost;
	}

	public void setTextPost(String textPost) {
		TextPost = textPost;
	}

	public String getImagePost() {
		return ImagePost;
	}

	public void setImagePost(String imagePost) {
		ImagePost = imagePost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Boolean getPinned() {
		return Pinned;
	}

	public void setPinned(Boolean pinned) {
		Pinned = pinned;
	}
	
	public String getCategoryPost() {
		return CategoryPost;
	}

	public void setCategoryPost(String categoryPost) {
		CategoryPost = categoryPost;
	}
	

// ---------------------------------------------------- ToString ---------------------------------------------------------------

	@Override
	public String toString() {
		return "ForumPost [IdPost=" + IdPost + ", IdUser=" + IdUser + ", TitlePost=" + TitlePost + ", DatePost="
				+ DatePost + ", TextPost=" + TextPost + ", ImagePost=" + ImagePost + ", CategoryPost=" + CategoryPost
				+ ", Pinned=" + Pinned + ", user=" + user + ", forumPostComment=" + forumPostComment + "]";
	}

}
