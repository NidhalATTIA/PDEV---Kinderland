package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Blog;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.RechercheMenu;
import tn.esprit.spring.entity.Subscribe;
import tn.esprit.spring.repository.BlogRepository;
import tn.esprit.spring.repository.KindergardenRepository;
import tn.esprit.spring.repository.RechercheRepository;
import tn.esprit.spring.repository.SubscribeRepository;

@Service
public class RechercheServiceImpl implements RechercheService {

	@Autowired
	RechercheRepository Kindergardenrepository;
	KindergardenRepository krepository;
	

	public static final Logger l = LogManager.getLogger(RechercheServiceImpl.class);

	// Ajout
	


	@Override
	public Long AddMenu(RechercheMenu blog) {
		 Kindergardenrepository.save(blog);
		  return blog.getId();

	}
	@Override
	public Boolean comparaison(RechercheMenu R1,Kindergarden R2){
	List<RechercheMenu>	 list= new ArrayList<>();
	List<Kindergarden>	 list1= new ArrayList<>();
	List<Kindergarden>	 list2= new ArrayList<>();
	Boolean k=false;
	
   //if (R1.getMaxprix()==null && R2.getCost()==0){
	 //  if(R1.getRue().equals(R2.getAdress()) && (R1.getTitre()==R2.getTitle()) && (R1.getMaxprix().equals(R2.getCost()))){
		//   list2.add(R2);
		  // return list2;
		   
	   //}
	   //else
	   {
		  
		   if(R1.getRue().equals(R2.getAdress()) && (R1.getTitre()==R2.getTitle()) && (R1.getMaxprix().equals(R2.getCost()))){
			   
			   return k;
		   }
		   
	   } 
	   
   
   return k;

    
		
	}
	@Override
	public List<Kindergarden> pp(){
		List<RechercheMenu>	 list= new ArrayList<>();
		List<Kindergarden>	 list1= new ArrayList<>();
		/*for (Kindergarden R2: krepository.findAll()){
			for(RechercheMenu u: Kindergardenrepository.findAll()){
				if(comparaison(u,R2)== true){
					list1.add(R2);
					return list1;
				}
			
		}
		
	
  
 
}*/
		for (Kindergarden R2: list1){
			for(RechercheMenu u:list){
				if (u.getMaxprix().equals(R2.getCost())){
					return list1;
					
				}
			}
		}
			
	return list1;

}
}


	


	
		

	


	


