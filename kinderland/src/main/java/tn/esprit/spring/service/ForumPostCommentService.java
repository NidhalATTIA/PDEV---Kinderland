package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.ForumPostComment;

public interface ForumPostCommentService {
	public ForumPostComment AddForumPostComment(ForumPostComment forumpostcomment);

	public List<ForumPostComment> GetAllForumPostCommentJPQL();

	public ForumPostComment GetForumPostCommentById(Long ForumPostCommentId);

	public ForumPostComment UpdateForumPostComment(ForumPostComment forumpostcomment);

	public void DeleteForumPostComment(Long ForumPostCommentId);

}
