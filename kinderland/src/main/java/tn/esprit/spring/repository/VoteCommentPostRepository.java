package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.VoteCommentPost;


public interface VoteCommentPostRepository extends CrudRepository<VoteCommentPost, Long>{
	


}
