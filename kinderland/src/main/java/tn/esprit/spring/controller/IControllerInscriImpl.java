package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entity.Child;
import tn.esprit.spring.entity.Event;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.Subscribe;
import tn.esprit.spring.service.ChildInscriService;
import tn.esprit.spring.service.KindergardenService;
import tn.esprit.spring.service.SubscribeService;
import tn.esprit.spring.service.TeacherService;

@Controller
public class IControllerInscriImpl {
	@Autowired
	ChildInscriService teacherService;
	
	
	

	public Long AddKindergarden(Child event){
		teacherService.AddChild(event);
		return event.getId();
	}

	public List<Child> GetAllKindergardenJPQL(){
		return teacherService.GetAllKindergardenJPQL();
	}
	/*public int updateEvent (int eventId,Event event){
		 Event event2=teacherRepository.save(event2);
		return new Event(event2.getIdEvent(), null, null, null);
	}
	*/
	
/*	public void updateEventByIdJPQL(int eventId,Event event){
		teacherService.updateEventByIdJPQL(eventId,event);
	}
	*/
	
	
	
	
}

