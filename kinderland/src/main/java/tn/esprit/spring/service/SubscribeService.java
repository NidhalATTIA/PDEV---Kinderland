package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.Subscribe;



public interface SubscribeService {
	public Long AddSubscriber(Subscribe blog);
	
	public List<Subscribe> GetAllKindergardenJPQL();
	
	public Subscribe GetSubscriberById(Long BlogId);
	
	//public Kindergarden UpdateKindergarden( Long BlogId, Kindergarden blog);
	
	public void DeleteSubscriber(Long BlogId);
	
}
