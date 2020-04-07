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
import javax.persistence.ManyToMany;

@Entity
public class ForumPostComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdPostComment;
	
	@Column(name = "TextComment")
	private String TextComment;
	
	@Column(name = "ImageComment")
	private String ImageComment;
	
	@Column(name = "DateComment")
	private Date DatePost;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<ForumPost> forumPost;
	
	// -------------------------------------------------------- Getters and Setters ------------------------------------------------	

	public long getIdPostComment() {
		return IdPostComment;
	}

	public void setIdPostComment(long idPostComment) {
		IdPostComment = idPostComment;
	}

	public String getTextComment() {
		return TextComment;
	}

	public void setTextComment(String textComment) {
		TextComment = textComment;
	}

	public String getImageComment() {
		return ImageComment;
	}

	public void setImageComment(String imageComment) {
		ImageComment = imageComment;
	}

	public Date getDatePost() {
		return DatePost;
	}

	public void setDatePost(Date datePost) {
		DatePost = datePost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// ---------------------------------------------------- ToString ---------------------------------------------------------------
	
	@Override
	public String toString() {
		return "PostComment [IdPostComment=" + IdPostComment + ", TextComment=" + TextComment + ", ImageComment="
				+ ImageComment + ", DatePost=" + DatePost + "]";
	}
	
	
}
