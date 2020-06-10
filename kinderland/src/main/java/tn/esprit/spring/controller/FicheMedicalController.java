package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Consultation;
import tn.esprit.spring.entity.FicheMedical;
import tn.esprit.spring.service.IFicheMedicalService;


@RestController
public class FicheMedicalController {
	@Autowired
	IFicheMedicalService ficheMedicalService;
	
	// http://localhost:8081/SpringMVC/servlet/
	
	@GetMapping("/retrieve-all-ficheMedical")
	@ResponseBody
	public List<FicheMedical> getFicheMedicals() {
		List<FicheMedical> list = ficheMedicalService.GetAllFicheMedicalJPQL();
		return list;
	}
	
	@DeleteMapping("/rmv-ficheMedical")
	@ResponseBody
	public void rmvFicheMedical() {
		ficheMedicalService.DeleteFicheMedical((long)2);
	}
	
	@GetMapping("/find-ficheMedical")
	@ResponseBody
	public FicheMedical findFicheMedical() {
		return  ficheMedicalService.GetFicheMedicalById((long) 1);
	}
	@PostMapping("/add-ficheMedical")
	@ResponseBody
	public void addConsultation(@RequestBody FicheMedical con) {
		ficheMedicalService.AddFicheMedical(con);
	}
	@GetMapping("/Edit-ficheMedical")
	@ResponseBody
	public void EditConsultation(long id) {
	FicheMedical fiche = ficheMedicalService.GetFicheMedicalById(id);
	ficheMedicalService.UpdateFicheMedical(fiche);
	}
}
