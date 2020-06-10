package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.Subscribe;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.BlogRepository;
import tn.esprit.spring.repository.KindergardenRepository;
import tn.esprit.spring.repository.SubscribeRepository;

@Service
public class SubscribeServiceImpl implements SubscribeService {

	@Autowired
	SubscribeRepository Kindergardenrepository;

	public static final Logger l = LogManager.getLogger(SubscribeServiceImpl.class);

	// Ajout
	@Override
	public Long AddSubscriber(Subscribe blog,int iduser) {
		if (Kindergardenrepository.getReclamationbyidUser(iduser)>=5){
			return blog.getIdSubscribe();
		}
		else {
	  Kindergardenrepository.save(blog);
		}
	  return blog.getIdSubscribe();
	  
	}
	
	// Affichage all
	@Override
	public List<Subscribe> GetAllKindergardenJPQL() {
		return (List<Subscribe>) Kindergardenrepository.findAll();
	}


	@Override
	public Subscribe GetSubscriberById(Long BlogId) {
		// TODO Auto-generated method stub
		Subscribe blog = Kindergardenrepository.findById(BlogId).orElse(null);
		l.info("retrive blog by id +++++;" + blog);
		return blog;
	}

	@Override
	public void DeleteSubscriber(Long BlogId) {
		// TODO Auto-generated method stub
		Kindergardenrepository.deleteById(BlogId);
		
	}

	

}
