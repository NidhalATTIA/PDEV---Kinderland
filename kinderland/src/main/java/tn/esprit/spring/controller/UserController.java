package tn.esprit.spring.controller;

import java.util.List;

import org.ocpsoft.rewrite.annotation.Join;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.UserInterface;

@RestController
@Join(path = "/", to = "/welcome.jsf")
public class UserController {

	@Autowired
	UserInterface userService;
	User u = new User();
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-users
	@GetMapping("/retrieve-all-users")
	@ResponseBody
	public List<User> getUsers() {
		List<User> list = userService.listUsers();
		return list;

	}

	@GetMapping("/add-users")
	@ResponseBody
	public void saveUser() {
		u.setEtat("sss");
		u.setEmail("email");
		u.setBDate("bdate");
		u.setPassword("pass");
		u.setLastName("cdede");
		u.setFirstName("hou");
		
		 userService.saveUser(u);
		

	}
	@GetMapping("/Edit-users")
	@ResponseBody
	public void EditUser() {
		u=userService.findById((long) 2);
		u.setEtat("modif");
		u.setLastName("look");
		
		
		 userService.saveUser(u);
		

	}
	@GetMapping("/rmv-users")
	@ResponseBody
	public void rmvUser() {
		userService.removeById((long) 2);
	}
	
	@GetMapping("/find-user")
	@ResponseBody
	public User finduser() {
		return userService.findById((long) 2);
	}
}