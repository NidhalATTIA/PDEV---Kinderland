package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.ForumPost;
import tn.esprit.spring.repository.ForumPostRepository;

public class ForumPostServiceImpl implements ForumPostService {

	@Autowired
	ForumPostRepository forumpostrepository;

	public static final Logger l = LogManager.getLogger(ForumPostServiceImpl.class);

	// Ajout
	@Override
	public ForumPost AddForumPost(ForumPost forumpost) {
		return forumpostrepository.save(forumpost);
	}

	// Affichage all
	@Override
	public List<ForumPost> GetAllForumPostJPQL() {
		return (List<ForumPost>) forumpostrepository.findAll();
	}

	// Affichage 1
	@Override
	public ForumPost GetForumPostById(Long ForumPostId) {
		ForumPost forumpost = forumpostrepository.findById(ForumPostId).orElse(null);
		l.info("retrive blog by id +++++;" + forumpost);
		return forumpost;
	}

	// Modification
	@Override
	public ForumPost UpdateForumPost(ForumPost forumpost) {
		return forumpostrepository.save(forumpost);
	}

	// Supression
	@Override
	public void DeleteForumPost(Long ForumPostId) {
		forumpostrepository.deleteById(ForumPostId);
	}

}
