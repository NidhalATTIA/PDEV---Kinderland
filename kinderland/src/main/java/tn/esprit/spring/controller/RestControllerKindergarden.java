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
import tn.esprit.spring.entity.RechercheMenu;
import tn.esprit.spring.service.KindergardenService;
import tn.esprit.spring.service.RechercheService;
import tn.esprit.spring.service.TeacherService;

@RestController
public class RestControllerKindergarden {

	@Autowired
	KindergardenService teacherService;
	RechercheService Rservice;
	/*--------------------------------Events------------------------------------------*/
	
	// http://localhost:8081/SpringMVC/servlet/addKindergarden
	// {"idEvent":5,"titleevent":"abc","descriptionEvent":"def"}
	@PostMapping("/addKindergarden")
	@ResponseBody
	public Kindergarden AddKindergarden(@RequestBody Kindergarden event) {
		teacherService.AddKindergarden(event);
		return event;
	}

	// http://localhost:8081/SpringMVC/servlet/getAllKindergardens
	@GetMapping(value = "/getAllKinderGardens")
	@ResponseBody
	public List<Kindergarden> GetAllKindergardenJPQL() {

		return teacherService.GetAllKindergardenJPQL();
	}

	
	// http://localhost:8081/SpringMVC/servlet/updateKindergarden/2
	@PutMapping(value = "/updateKinderGarden/{id}")
	@ResponseBody
	public Kindergarden UpdateKindergarden(@RequestBody Kindergarden event,@PathVariable("id") Long eventId) {
	
		return teacherService.UpdateKindergarden(eventId,event);
	}
	/*// http://localhost:8081/SpringMVC/servlet/updateEvent/2
		@PutMapping(value = "/updateEventJPQL/{id}") 
		@ResponseBody
		public void updateEventByIdJPQL(@RequestBody Event event,@PathVariable("id") int eventId) {
			teacherService.updateEventByIdJPQL(eventId,event);
		}*/

	// http://localhost:8081/SpringMVC/servlet/deleteEvent/2
	@DeleteMapping(value = "/deleteKindergarden/{id}")
	@ResponseBody
	public void DeleteKindergarden(@PathVariable("id") Long eventId) {
		teacherService.DeleteKindergarden(eventId);
	}
	/*--------------------------------Plannings------------------------------------------*/

	public static void main(String[] args) {
		//Subscribe
	}
	// http://localhost:8081/SpringMVC/servlet/addKindergarden
		// {"idEvent":5,"titleevent":"abc","descriptionEvent":"def"}
		@PostMapping("/addrecherche")
		@ResponseBody
		public RechercheMenu AddMenu(@RequestBody RechercheMenu event) {
			Rservice.AddMenu(event);
			return event;
		}
	// http://localhost:8081/SpringMVC/servlet/addKindergarden
		// {"idEvent":5,"titleevent":"abc","descriptionEvent":"def"}
		@GetMapping("/compare") 
		@ResponseBody
		public List<Kindergarden> pp() {
				return Rservice.pp()   ;
		}
	
	

}