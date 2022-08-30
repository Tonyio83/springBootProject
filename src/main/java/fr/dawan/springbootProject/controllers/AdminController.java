package fr.dawan.springbootProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.springbootProject.entities.ArticleForm;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/articles")
	public String listArticles() {
		return "listArticles";
	}
	
	@GetMapping("/users")
	public String listUsers() {
		return "listUsersInfos";
	}

	 @GetMapping("/addArticle")
	    public String addArticle(@ModelAttribute("formArticle") ArticleForm userForm) {
	        return "addArticle";
	    }
	 @GetMapping("/updateArticle")
	    public String updateArticle(@ModelAttribute("formArticle") ArticleForm userForm) {
	        return "updateArticle";
	    }

}