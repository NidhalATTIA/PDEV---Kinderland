package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;


import tn.esprit.spring.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}


