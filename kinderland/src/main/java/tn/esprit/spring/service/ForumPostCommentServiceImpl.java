package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.ForumPostComment;
import tn.esprit.spring.repository.ForumPostCommentRepository;

@Service
public class ForumPostCommentServiceImpl implements ForumPostCommentService {

	@Autowired
	ForumPostCommentRepository forumpostcommentrepository;

	public static final Logger l = LogManager.getLogger(ForumPostCommentServiceImpl.class);

	// Ajout
	@Override
	public ForumPostComment AddForumPostComment(ForumPostComment forumpostcomment) {
		return forumpostcommentrepository.save(forumpostcomment);
	}

	// Affichage all
	@Override
	public List<ForumPostComment> GetAllForumPostCommentJPQL() {
		return (List<ForumPostComment>) forumpostcommentrepository.findAll();
	}

	// Affichage 1
	@Override
	public ForumPostComment GetForumPostCommentById(Long ForumPostCommentId) {
		ForumPostComment forumpostcomment = forumpostcommentrepository.findById(ForumPostCommentId).orElse(null);
		l.info("retrive blog by id +++++;" + forumpostcomment);
		return forumpostcomment;
	}

	// Modification
	@Override
	public ForumPostComment UpdateForumPostComment(ForumPostComment forumpostcomment) {
		return forumpostcommentrepository.save(forumpostcomment);
	}

	// Supression
	@Override
	public void DeleteForumPostComment(Long ForumPostCommentId) {
		forumpostcommentrepository.deleteById(ForumPostCommentId);

	}

}
