package fr.dawan.springbootProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.springbootProject.forms.LoginForm;

@Controller
@RequestMapping("/user")
public class LoginController {

	@GetMapping("/login")
    public String getLogin(@ModelAttribute("formLogin") LoginForm form) {
        return "login";
    }

}
