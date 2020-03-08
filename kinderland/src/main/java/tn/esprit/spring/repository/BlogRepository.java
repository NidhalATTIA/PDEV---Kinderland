package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Blog;

public interface BlogRepository extends CrudRepository<Blog, Long>{

}
