package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Child;
import tn.esprit.spring.entity.Kindergarden;



public interface ChildInscriService {
	public Child AddChild(Child blog);
	
	public List<Child> GetAllKindergardenJPQL();
	
	//public Kindergarden GetKindergardenById(Long BlogId);
	
	//public Kindergarden UpdateKindergarden( Long BlogId, Kindergarden blog);
	
	//public void DeleteKindergarden(Long BlogId);
	
}
