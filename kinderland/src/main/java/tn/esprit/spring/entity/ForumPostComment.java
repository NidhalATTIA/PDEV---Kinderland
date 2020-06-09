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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


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
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date DatePost;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ForumPost forumPost;
		
	@OneToMany(cascade = CascadeType.ALL)
	private Set<VoteComment> voteCommentPost;
	
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
		return "ForumPostComment [IdPostComment=" + IdPostComment + ", TextComment=" + TextComment + ", ImageComment="
				+ ImageComment + ", DatePost=" + DatePost + ", user=" + user + ", forumPost=" + forumPost + "]";
	}
	
	
}
