package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.RechercheMenu;



public interface RechService {
	

	List<Kindergarden> FiltreMulticritèreV(String adress, String title, float cost);


	
	
	
	

	
}
