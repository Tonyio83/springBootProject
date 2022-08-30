package fr.dawan.springbootProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.springbootProject.entities.UserForm;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/")
	public String accueil() {
		return "home";
	}

	@GetMapping("/signIn")
	public String signIn(@ModelAttribute("formUser") UserForm userForm) {
		return "addUser";
	}
}
