package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;

public interface KindergardenRepository extends CrudRepository<Kindergarden, Long>{
	


	

}
