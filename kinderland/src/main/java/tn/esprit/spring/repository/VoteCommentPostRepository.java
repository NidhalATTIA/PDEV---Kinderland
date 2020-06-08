package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Admin;
import tn.esprit.spring.entity.VoteCommentPost;


public interface VoteCommentPostRepository extends CrudRepository<VoteCommentPost, Long>{

}
