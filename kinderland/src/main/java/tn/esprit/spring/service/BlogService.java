package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Blog;



public interface BlogService {
	public Blog AddBlog(Blog blog);
	
	public List<Blog> GetAllBlogJPQL();
	
	public Blog GetBlogById(Long BlogId);
	
	public Blog UpdateBlog(Long BlogId,Blog blog);
	
	public void DeleteBlog(Long BlogId);
	
}
