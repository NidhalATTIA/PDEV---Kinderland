package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;



public interface KindergardenService {
	public Kindergarden AddKindergarden(Kindergarden blog);
	
	public List<Kindergarden> GetAllKindergardenJPQL();
	
	public Kindergarden GetKindergardenById(Long BlogId);
	
	public Kindergarden UpdateKindergarden( Long BlogId, Kindergarden blog);
	
	public void DeleteKindergarden(Long BlogId);
	
}
