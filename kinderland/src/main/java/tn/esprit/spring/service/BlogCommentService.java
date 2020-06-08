package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.BlogComment;

public interface BlogCommentService {
	public BlogComment AddBlogComment(BlogComment blogcomment);

	public List<BlogComment> GetAllBlogCommentJPQL();

	public BlogComment GetBlogCommentById(Long blogCommentId);

	public BlogComment UpdateBlogComment(Long blogCommentId, BlogComment blogcomment);

	public void DeleteBlogComment(Long blogCommentId);

}
