package fr.dawan.springbootProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/")
	public String accueil() {
		return "home";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/signIn")
	public String signIn() {
		return "signIn";
	}
}
