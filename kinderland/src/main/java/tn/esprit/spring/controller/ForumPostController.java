package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.ForumPost;
import tn.esprit.spring.service.ForumPostService;

@RestController
public class ForumPostController {

	@Autowired
	ForumPostService forumPostService;
	ForumPost fp = new ForumPost();

	@GetMapping("/retrieve-all-posts")
	@ResponseBody
	public List<ForumPost> getForumPost() {
		List<ForumPost> list = forumPostService.GetAllForumPostJPQL();
		return list;

	}

	@GetMapping("/add-post")
	@ResponseBody
	public void saveUser() {
		fp.setTextPost("ssssssssss");
		forumPostService.AddForumPost(fp);

	}

	@GetMapping("/Edit-post")
	@ResponseBody
	public void EditUser() {
		fp = forumPostService.GetForumPostById((long) 2);
		fp.setTitlePost("tttttt");

		forumPostService.UpdateForumPost(fp);
	}

	@GetMapping("/rmv-post")
	@ResponseBody
	public void rmvUser() {
		forumPostService.DeleteForumPost((long) 2);
	}

	@GetMapping("/find-post")
	@ResponseBody
	public ForumPost findpost() {
		return forumPostService.GetForumPostById((long) 2);
	}

}
