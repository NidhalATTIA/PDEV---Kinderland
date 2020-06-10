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

import tn.esprit.spring.entity.Child;
import tn.esprit.spring.entity.Event;
import tn.esprit.spring.entity.Kindergarden;
import tn.esprit.spring.entity.Planning;
import tn.esprit.spring.entity.Subscribe;
import tn.esprit.spring.service.ChildInscriService;
import tn.esprit.spring.service.KindergardenService;
import tn.esprit.spring.service.SubscribeService;
import tn.esprit.spring.service.TeacherService;

@RestController
public class RestControllerInscri {

	@Autowired
	ChildInscriService teacherService;
	/*--------------------------------Events------------------------------------------*/
	
	// http://localhost:8081/SpringMVC/servlet/addKindergarden
	// {"idEvent":5,"titleevent":"abc","descriptionEvent":"def"}
	@PostMapping("/addChild")
	@ResponseBody
	public Child AddKindergarden(@RequestBody Child event) {
		teacherService.AddChild(event);
		return event;
	}

	// http://localhost:8081/SpringMVC/servlet/getAllKindergardens
	@GetMapping(value = "/getAllChildren")
	@ResponseBody
	public List<Child> GetAllKindergardenJPQL() {

		return teacherService.GetAllKindergardenJPQL();
	}



}