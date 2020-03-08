package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.BlogComment;

public interface BlogCommentRepository extends CrudRepository<BlogComment, Long>{

}
