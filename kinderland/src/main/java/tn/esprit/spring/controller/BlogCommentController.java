package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.BlogComment;
import tn.esprit.spring.service.BlogCommentService;




@RestController
public class BlogCommentController {

	@Autowired
	BlogCommentService blogCommentService;
	BlogComment bc = new BlogComment();

	@GetMapping("/retrieve-all-Bcomments")
	@ResponseBody
	public List<BlogComment> getBlogComment() {
		List<BlogComment> list = blogCommentService.GetAllBlogCommentJPQL();
		return list;
	}

	@GetMapping("/add-Bcomments")
	@ResponseBody
	public void saveBlogComment() {
		bc.setTextComment("aaaaaaaaaa");
		blogCommentService.AddBlogComment(bc);

	}

	@GetMapping("/Edit-Bcomments")
	@ResponseBody
	public void EditBlogComment() {
		bc = blogCommentService.GetBlogCommentById((long) 2);
		bc.setTextComment("tttttt");

		blogCommentService.UpdateBlogComment(bc);
	}

	@GetMapping("/rmv-Bcomments")
	@ResponseBody
	public void rmvForumPostComment() {
		blogCommentService.DeleteBlogComment((long) 2);
	}


}
