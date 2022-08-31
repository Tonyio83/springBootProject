package fr.dawan.springbootProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.springbootProject.entities.Adresse;
import fr.dawan.springbootProject.forms.AdresseForm;
import fr.dawan.springbootProject.repositories.AdresseRepository;

@Controller
@RequestMapping("/adresse")
public class AdresseController {

	@Autowired
	AdresseRepository adresseRepository;

	@GetMapping("/updateF/{id}")
	public String getAdresseFById(@ModelAttribute("formAdresse") AdresseForm adresseForm, @PathVariable long id) {
		//model.addAttribute("adresseF", adresseRepository.findById(id));	
		Adresse a = adresseRepository.findById(id);
		adresseForm.setNumero(a.getNumero());
		adresseForm.setRue(a.getRue());
		adresseForm.setCodePostal(a.getCodePostal());
		adresseForm.setVille(a.getVille());
		return "updateAdresse";
	}
	
}
