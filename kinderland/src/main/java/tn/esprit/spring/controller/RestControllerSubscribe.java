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
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.Planning;
import tn.esprit.spring.entity.Subscribe;
import tn.esprit.spring.service.KindergardenService;
import tn.esprit.spring.service.SubscribeService;
import tn.esprit.spring.service.TeacherService;

@RestController
public class RestControllerSubscribe {

	@Autowired
	SubscribeService teacherService;
	/*--------------------------------Events------------------------------------------*/
	
	// http://localhost:8081/SpringMVC/servlet/addKindergarden
	// {"idEvent":5,"titleevent":"abc","descriptionEvent":"def"}
	@PostMapping("/addSubscriber")
	@ResponseBody
	public Subscribe AddKindergarden(@RequestBody Subscribe event) {
		teacherService.AddSubscriber(event);
		return event;
	}

	// http://localhost:8081/SpringMVC/servlet/getAllKindergardens
	@GetMapping(value = "/getAllSubscriptions")
	@ResponseBody
	public List<Subscribe> GetAllKindergardenJPQL() {

		return teacherService.GetAllKindergardenJPQL();
	}


	/*// http://localhost:8081/SpringMVC/servlet/updateEvent/2
		@PutMapping(value = "/updateEventJPQL/{id}") 
		@ResponseBody
		public void updateEventByIdJPQL(@RequestBody Event event,@PathVariable("id") int eventId) {
			teacherService.updateEventByIdJPQL(eventId,event);
		}*/

	// http://localhost:8081/SpringMVC/servlet/deleteEvent/2
	@DeleteMapping(value = "/deleteSubscription/{id}")
	@ResponseBody
	public void DeleteKindergarden(@PathVariable("id") Long eventId) {
		teacherService.DeleteSubscriber(eventId);
	}
	/*--------------------------------Plannings------------------------------------------*/

	public static void main(String[] args) {
		//Subscribe
	}

}