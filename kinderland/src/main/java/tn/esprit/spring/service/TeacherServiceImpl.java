package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Event;
import tn.esprit.spring.entity.Planning;
import tn.esprit.spring.repository.EventRepository;
import tn.esprit.spring.repository.PlanningRepository;
import tn.esprit.spring.repository.TeacherRepository;
@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	EventRepository eventRepository;
	@Autowired
	TeacherRepository teacherRepository;
	@Autowired
	PlanningRepository planningRepository;
	
	
	
	/*--------------------------------Events------------------------------------------*/
	public List<Event> getAllEvents() {
		return (List<Event>)  eventRepository.findAll();
	}

	public int addEvent(Event event) {
		eventRepository.save(event);
		return event.getIdEvent();
	}
	
	
	public Event updateEvent (int eventId,Event event) {
	
		Event event1 = eventRepository.findById(eventId).get();
		
		 event1.setTitleevent(event.getTitleevent());
		 event1.setDescriptionEvent(event.getDescriptionEvent());
		 Event event2=eventRepository.save(event1);
					
		return new Event(event2.getIdEvent(), event2.getTitleevent(),event2.getDateEvent(),event2.getDescriptionEvent(),null);
	}
	
	/*public void updateEventByIdJPQL(int eventId,Event event) {
		eventRepository.updateEventByIdJPQL(event,eventId);
	}*/
	/*
	public void updateEventById (int eventId) {
		Event event = eventRepository.findById(eventId).get();
		
		eventRepository.save(event);
	}*/
	public void deleteEventById(int eventId) {
		Event event = eventRepository.findById( eventId).get();
			eventRepository.delete(event);
	}

	
	/*--------------------------------Plannings------------------------------------------*/
	public List<Planning> getAllPlannings(){
		return (List<Planning>)  planningRepository.findAll();
	}
	public int addPlanning(Planning planning){
		planningRepository.save(planning);
		return planning.getIdPlanning();
	}
	
	public Planning updatePlanning(int planningId,Planning planning){
	
		Planning planning1 = planningRepository.findById(planningId).get();
	
	 planning1.setSession(planning1.getSession());
	 planning1.setDateplanning(planning.getDateplanning());
	 Planning planning2=planningRepository.save(planning1);
				
	return new Planning (planning2.getIdPlanning(), planning2.getSession(),planning2.getContent(), planning2.getDateplanning(),null);
}
	public void deletePlanningById(int planningId){
		Planning planning = planningRepository.findById(planningId).get();
		planningRepository.delete(planning);
	}

	
}


