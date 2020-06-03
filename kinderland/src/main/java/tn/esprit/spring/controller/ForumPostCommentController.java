package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.ForumPost;
import tn.esprit.spring.entity.ForumPostComment;
import tn.esprit.spring.service.ForumPostCommentService;


@RestController
public class ForumPostCommentController {

	@Autowired
	ForumPostCommentService forumPostCommentService;
	ForumPostComment fpc = new ForumPostComment();

	@GetMapping("/retrieve-all-comments")
	@ResponseBody
	public List<ForumPostComment> getForumPost() {
		List<ForumPostComment> list = forumPostCommentService.GetAllForumPostCommentJPQL();
		return list;
	}

	@GetMapping("/add-comments")
	@ResponseBody
	public void saveUser() {
		fpc.setTextComment("aaaaaaaaaa");
		forumPostCommentService.AddForumPostComment(fpc);

	}

	@GetMapping("/Edit-comments")
	@ResponseBody
	public void EditUser() {
		fpc = forumPostCommentService.GetForumPostCommentById((long) 2);
		fpc.setTextComment("tttttt");

		forumPostCommentService.UpdateForumPostComment(fpc);
	}

	@GetMapping("/rmv-comments")
	@ResponseBody
	public void rmvUser() {
		forumPostCommentService.DeleteForumPostComment((long) 2);
	}


}
