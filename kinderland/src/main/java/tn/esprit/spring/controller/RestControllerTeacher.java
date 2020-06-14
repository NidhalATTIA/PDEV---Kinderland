package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Event;
import tn.esprit.spring.entity.Planning;
import tn.esprit.spring.service.TeacherService;

@RestController
public class RestControllerTeacher {

	@Autowired
	TeacherService teacherService;
	/*--------------------------------Events------------------------------------------*/
	
	// http://localhost:8081/SpringMVC/servlet/addEvent
	// {"idEvent":5,"titleevent":"abc","descriptionEvent":"def"}
	@PostMapping("/addEvent")
	@ResponseBody
	public Event addEvent(@RequestBody Event event) {
		teacherService.addEvent(event);
		return event;
	}

	// http://localhost:8081/SpringMVC/servlet/getAllEvents
	@GetMapping(value = "/getAllEvents")
	@ResponseBody
	public List<Event> getAllEvents() {

		return teacherService.getAllEvents();
	}

	
	// http://localhost:8081/SpringMVC/servlet/updateEvent/2
	@PutMapping(value = "/updateEvent/{id}")
	@ResponseBody
	public Event updateEvent(@RequestBody Event event,@PathVariable("id") int eventId) {
	
		return teacherService.updateEvent(eventId,event);
	}
	/*// http://localhost:8081/SpringMVC/servlet/updateEvent/2
		@PutMapping(value = "/updateEventJPQL/{id}") 
		@ResponseBody
		public void updateEventByIdJPQL(@RequestBody Event event,@PathVariable("id") int eventId) {
			teacherService.updateEventByIdJPQL(eventId,event);
		}*/

	// http://localhost:8081/SpringMVC/servlet/deleteEvent/2
	@DeleteMapping(value = "/deleteEvent/{id}")
	@ResponseBody
	public void deleteEventById(@PathVariable("id") int eventId) {
		teacherService.deleteEventById(eventId);
	}
	/*--------------------------------Plannings------------------------------------------*/

	// http://localhost:8081/SpringMVC/servlet/addPlanning
		// {"idPlanning":5,"titleplanning":"abc","descriptionPlanning":"def"}
		@PostMapping("/addPlanning")
		@ResponseBody
		public Planning addPlanning(@RequestBody Planning planning) {
			teacherService.addPlanning(planning);
			return planning;
		}

		// http://localhost:8081/SpringMVC/servlet/getAllPlannings
		@GetMapping(value = "/getAllPlannings")
		@ResponseBody
		public List<Planning> getAllPlannings() {

			return teacherService.getAllPlannings();
		}

		
		// http://localhost:8081/SpringMVC/servlet/updatePlanning/2
		@PutMapping(value = "/updatePlanning/{id}")
		@ResponseBody
		public Planning updatePlanning(@RequestBody Planning planning,@PathVariable("id") int planningId) {
		
			return teacherService.updatePlanning(planningId,planning);
		}
		/*// http://localhost:8081/SpringMVC/servlet/updatePlanning/2
			@PutMapping(value = "/updatePlanningJPQL/{id}") 
			@ResponseBody
			public void updatePlanningByIdJPQL(@RequestBody Planning planning,@PathVariable("id") int planningId) {
				teacherService.updatePlanningByIdJPQL(planningId,planning);
			}*/

		// http://localhost:8081/SpringMVC/servlet/deletePlanning/2
		@DeleteMapping(value = "/deletePlanning/{id}")
		@ResponseBody
		public void deletePlanningById(@PathVariable("id") int planningId) {
			teacherService.deletePlanningById(planningId);
		}
}
