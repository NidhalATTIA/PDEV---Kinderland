package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.ForumPost;

public interface ForumPostRepository extends CrudRepository<ForumPost, Long>{

}
