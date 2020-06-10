package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.RechercheMenu;

public interface RechRepository extends CrudRepository<RechercheMenu, Long>{
	
	@Query(value="Select * from kindergarden WHERE adress=? AND title=? AND cost=? ",nativeQuery=true)
    public List<Kindergarden> findAdByCriteriaV(String adress, String title,float cost);
}
