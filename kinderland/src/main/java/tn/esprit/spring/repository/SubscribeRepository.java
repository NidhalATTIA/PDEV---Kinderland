package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.Subscribe;

public interface SubscribeRepository extends CrudRepository<Subscribe, Long>{
	
	//@Query("SELECT count(*) FROM subscribe WHERE idUser=?")
    //public  List<Subscribe>  TreatedReclamation();
	
	@Query("SELECT count(*) FROM Subscribe r join User u on r.iduser=u.IdUser WHERE u.IdUser=:user")
    public  int  getReclamationbyidUser(@Param("user")int iduser);
	

}
