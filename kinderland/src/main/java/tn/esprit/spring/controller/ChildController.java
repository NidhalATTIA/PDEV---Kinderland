package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.esprit.spring.entity.Child;
import tn.esprit.spring.service.IChildService;


public class ChildController {
	@Autowired
	IChildService ChildService;
	
	@GetMapping("/retrieve-all-children")
	@ResponseBody
	public List<Child> getChild() {
		List<Child> list = ChildService.GetAllChildJPQL();
		return list;

	}
	@GetMapping("/Add-child")
	@ResponseBody
	public void AddChild(Child ch) {
	
		 ChildService.AddChild(ch);
	}
	@GetMapping("/Edit-child")
	@ResponseBody
	public void EditChild(Child ch) {
	
		 ChildService.UpdateChild(ch);
	}
	
	@GetMapping("/rmv-child")
	@ResponseBody
	public void rmvChild() {
		ChildService.DeleteChild((long)2);
	}
	
	@GetMapping("/find-child")
	@ResponseBody
	public Child findChild() {
		return ChildService.GetChildById((long) 2);
	}
}
