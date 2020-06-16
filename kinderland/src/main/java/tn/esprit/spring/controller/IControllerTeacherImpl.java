package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.entity.Event;
import tn.esprit.spring.service.TeacherService;

@Controller
public class IControllerTeacherImpl {
	@Autowired
	TeacherService teacherService;
	
	
	

	public int addEvent(Event event){
		teacherService.addEvent(event);
		return event.getIdEvent();
	}

	public List<Event> getAllEvents(){
		return teacherService.getAllEvents();
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
	
	public void deleteEventById(int eventId){
		teacherService.deleteEventById(eventId);
	}
	
	
}

