package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entity.Event;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.Subscribe;
import tn.esprit.spring.service.KindergardenService;
import tn.esprit.spring.service.SubscribeService;
import tn.esprit.spring.service.TeacherService;

@Controller
public class IControllerSubscribeImpl {
	@Autowired
	SubscribeService teacherService;
	
	
	

	public Long AddKindergarden(Subscribe event,int iduser){
		teacherService.AddSubscriber(event,iduser);
		return event.getIdSubscribe();
	}

	public List<Subscribe> GetAllKindergardenJPQL(){
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
	
	public void DeleteKindergarden(Long eventId){
		teacherService.DeleteSubscriber(eventId);
	}
	
	
}

