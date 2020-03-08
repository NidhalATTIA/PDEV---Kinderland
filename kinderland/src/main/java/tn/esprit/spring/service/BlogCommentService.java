package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.BlogComment;

public interface BlogCommentService {
	public BlogComment AddBlogComment(BlogComment blogcomment);

	public List<BlogComment> GetAllBlogCommentJPQL();

	public BlogComment GetBlogCommentById(Long BlogCommentId);

	public BlogComment UpdateBlogComment(BlogComment blogcomment);

	public void DeleteBlogComment(Long BlogCommentId);

}
