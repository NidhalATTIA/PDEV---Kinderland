package tn.esprit.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Event;
import tn.esprit.spring.entity.Planning;

@Service
public interface TeacherService {

	/*--------------------------------Event------------------------------------------*/
	public List<Event> getAllEvents();
	public int addEvent(Event event);
	public Event updateEvent(int eventId,Event event);
	//public void updateEventByIdJPQL(int eventId,Event event);
	public void deleteEventById(int eventId);
	
	/*--------------------------------Planning------------------------------------------*/
	public List<Planning> getAllPlannings();
	public int addPlanning(Planning planning);
	public Planning updatePlanning(int planningId,Planning planning);
	public void deletePlanningById(int planningId);

}
