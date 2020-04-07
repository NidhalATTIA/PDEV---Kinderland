package tn.esprit.spring.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdBlogComment;
	
	@Column(name = "TextComment")
	private String TextComment;
	
	@Column(name = "ImageComment")
	private String ImageComment;
	
	@Column(name = "DateComment")
	private Date DatePost;
	
	// -------------------------------------------------------- Getters and Setters ------------------------------------------------	


	public long getIdBlogComment() {
		return IdBlogComment;
	}

	public void setIdBlogComment(long idBlogComment) {
		IdBlogComment = idBlogComment;
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
		return "BlogComment [IdBlogComment=" + IdBlogComment + ", TextComment=" + TextComment + ", ImageComment="
				+ ImageComment + ", DatePost=" + DatePost + "]";
	}
	

	
	
	
	

}