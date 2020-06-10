package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Child;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.repository.BlogRepository;
import tn.esprit.spring.repository.ChildRepository;
import tn.esprit.spring.repository.KindergardenRepository;

@Service
public class ChildInscriServiceImpl implements ChildInscriService {

	@Autowired
	ChildRepository Childrepository;

	public static final Logger l = LogManager.getLogger(ChildInscriServiceImpl.class);

	// Ajout
	@Override
	public Child AddChild(Child blog) {
		return Childrepository.save(blog);
	} 
	
	
	@Override
	public List<Child> GetAllKindergardenJPQL() {
		return (List<Child>) Childrepository.findAll();
	}

}
