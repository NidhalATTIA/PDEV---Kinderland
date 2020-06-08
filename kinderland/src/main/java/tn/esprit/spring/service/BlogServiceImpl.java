package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogRepository blogrepository;

	public static final Logger l = LogManager.getLogger(BlogServiceImpl.class);

	// Ajout
	@Override
	public Blog AddBlog(Blog blog) {
		return blogrepository.save(blog);
	}

	// Affichage all
	@Override
	public List<Blog> GetAllBlogJPQL() {
		return (List<Blog>) blogrepository.findAll();
	}

	// Affichage 1
	@Override
	public Blog GetBlogById(Long BlogId) {
		Blog blog = blogrepository.findById(BlogId).orElse(null);
		l.info("retrive blog by id +++++;" + blog);
		return blog;
	}

	// Modification
	@Override
	public Blog UpdateBlog(Long BlogId, Blog blog) {
		return blogrepository.save(blog);
	}

	// Supression
	@Override
	public void DeleteBlog(Long BlogId) {
		blogrepository.deleteById(BlogId);
	}

}
