package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.RechercheMenu;



public interface RechercheService {
	public Long AddMenu(RechercheMenu blog);

	public Boolean comparaison(RechercheMenu R1, Kindergarden R2);

	public List<Kindergarden> pp();

	
	
	
	

	
}
