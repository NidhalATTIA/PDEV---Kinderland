package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<ForumPostComment> getForumPostComment() {
		List<ForumPostComment> list = forumPostCommentService.GetAllForumPostCommentJPQL();
		return list;
	}
	
	@PostMapping("/add-comments")
	@ResponseBody
	public ForumPostComment saveForumPostComment(@RequestBody ForumPostComment forumPostComment) {	
		forumPostCommentService.AddForumPostComment(forumPostComment);
		return forumPostComment;
	}

	@PutMapping("/Edit-comments/{PostCommentId}")
	@ResponseBody
	public ForumPostComment EditForumPostComment(@PathVariable("PostCommentId")Long ForumPostCommentId,@RequestBody ForumPostComment forumPostComment) {
		forumPostCommentService.UpdateForumPostComment((long) ForumPostCommentId, forumPostComment);
		return forumPostComment;
	}

	@DeleteMapping("/rmv-comments/{PostCommentId}")
	@ResponseBody
	public void rmvForumPostComment(@PathVariable("PostCommentId")Long ForumPostCommentId) {
		forumPostCommentService.DeleteForumPostComment((long) ForumPostCommentId);
	}


}
