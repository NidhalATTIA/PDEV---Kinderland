package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Invitation;

import tn.esprit.spring.service.IInvitationService;

@RestController
public class InvitationController {

	@Autowired
	IInvitationService invitationService;
	
	@GetMapping("/retrieve-all-inv")
	@ResponseBody
	public List<Invitation> getinvs() {
		List<Invitation> list = invitationService.GetAllInvitationJPQL();
		return list;

	}


	
	@GetMapping("/rmv-inv")
	@ResponseBody
	public void rmvInv() {
		invitationService.DeleteInvitation((long)2);
	}
	
	@GetMapping("/find-inv")
	@ResponseBody
	public Invitation findinv() {
		return invitationService.GetInvitationById((long) 2);
	}
}
