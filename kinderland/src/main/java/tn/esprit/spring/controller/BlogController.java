package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.service.BlogService;



@RestController
public class BlogController {

	@Autowired
	BlogService blogService;
	Blog b = new Blog();

	@GetMapping("/retrieve-all-blogs")
	@ResponseBody
	public List<Blog> getBlog() {
		List<Blog> list = blogService.GetAllBlogJPQL();
		return list;

	}

	@GetMapping("/add-blog")
	@ResponseBody
	public void saveBlog() {
		b.setTextBlog("ssssssssss");
		blogService.AddBlog(b);

	}

	@GetMapping("/Edit-blog")
	@ResponseBody
	public void EditBlog() {
		b = blogService.GetBlogById((long) 2);
		b.setTitleBlog("tttttt");

		blogService.UpdateBlog(b);
	}

	@GetMapping("/rmv-blog")
	@ResponseBody
	public void rmvBlog() {
		blogService.DeleteBlog((long) 2);
	}

	@GetMapping("/find-blog")
	@ResponseBody
	public Blog findBlog() {
		return blogService.GetBlogById((long) 2);
	}

}
