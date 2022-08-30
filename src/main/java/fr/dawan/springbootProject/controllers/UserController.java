package fr.dawan.springbootProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.springbootProject.entities.UserForm;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/infos")
	public String accueil() {
		return "userInfos";
	}
	@GetMapping("/update")
	public String updateUser(@ModelAttribute("formUser") UserForm userForm) {
		return "updateUser";
	}

}
