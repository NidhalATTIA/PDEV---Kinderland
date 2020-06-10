package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.RDVMedical;
import tn.esprit.spring.service.IRDVMedicalService;

@RestController
public class RDVNedicalController {

	@Autowired
	IRDVMedicalService RDVMedical;
	
	@GetMapping("/retrieve-all-rdvs")
	@ResponseBody
	public List<RDVMedical> getFicheMedicals() {
		List<RDVMedical> list = RDVMedical.GetAllRDVMedicalJPQL();
		return list;

	}
	
	@GetMapping("/rmv-ficheMedical")
	@ResponseBody
	public void rmvFicheMedical() {
		RDVMedical.DeleteRDVMedical((long)2);
	}
	
	@GetMapping("/find-ficheMedical")
	@ResponseBody
	public RDVMedical findFicheMedical() {
		return  RDVMedical.GetRDVMedicalById((long) 1);
	}
	@PostMapping("/add-ficheMedical")
	@ResponseBody
	public void addConsultation(@RequestBody RDVMedical con) {
		RDVMedical.AddRDVMedical(con);
	}
	@GetMapping("/Edit-ficheMedical")
	@ResponseBody
	public void EditConsultation(long id) {
	RDVMedical fiche = RDVMedical.GetRDVMedicalById(id);
	RDVMedical.UpdateRDVMedical(fiche);
	}
}
