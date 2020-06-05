package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.repository.BlogRepository;
import tn.esprit.spring.repository.KindergardenRepository;

@Service
public class KindergardenServiceImpl implements KindergardenService {

	@Autowired
	KindergardenRepository Kindergardenrepository;

	public static final Logger l = LogManager.getLogger(KindergardenServiceImpl.class);

	// Ajout
	@Override
	public Kindergarden AddKindergarden(Kindergarden blog) {
		return Kindergardenrepository.save(blog);
	} 
	
	// Affichage all
	@Override
	public List<Kindergarden> GetAllKindergardenJPQL() {
		return (List<Kindergarden>) Kindergardenrepository.findAll();
	}

	// Affichage 1
	@Override
	public Kindergarden GetKindergardenById(Long BlogId) {
		Kindergarden blog = Kindergardenrepository.findById(BlogId).orElse(null);
		l.info("retrive blog by id +++++;" + blog);
		return blog;
	}

	// Modification
	@Override
	public Kindergarden UpdateKindergarden(Long BlogId,Kindergarden blog) {
		return Kindergardenrepository.save(blog);
	}

	// Supression
	@Override
	public void DeleteKindergarden(Long BlogId) {
		Kindergardenrepository.deleteById(BlogId);
	}

	

}
