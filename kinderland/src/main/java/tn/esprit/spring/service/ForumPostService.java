package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.ForumPost;

public interface ForumPostService {

	public ForumPost AddForumPost(ForumPost forumpost);

	public List<ForumPost> GetAllForumPostJPQL();

	public ForumPost GetForumPostById(Long ForumPostId);

	public ForumPost UpdateForumPost(ForumPost forumpost);

	public void DeleteForumPost(Long ForumPostId);
}
