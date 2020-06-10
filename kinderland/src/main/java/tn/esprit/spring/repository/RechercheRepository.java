package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.RechercheMenu;

public interface RechercheRepository extends CrudRepository<RechercheMenu, Long>{
	
//@Query("SELECT r FROM Kindergarden r WHERE r.cost=:pp AND r.title=:pptitle AND r.adress=:ppadress")
//public  List<Kindergarden>  TreatedReclamation(@Param("pp")float cost,@Param("pptitle")String title,@Param("ppadress")String adress);
}
