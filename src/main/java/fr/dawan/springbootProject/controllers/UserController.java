package fr.dawan.springbootProject.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.dawan.springbootProject.entities.Adresse;
import fr.dawan.springbootProject.entities.Utilisateur;
import fr.dawan.springbootProject.forms.MotdePasseValidation;
import fr.dawan.springbootProject.forms.UserForm;
import fr.dawan.springbootProject.repositories.AdresseRepository;
import fr.dawan.springbootProject.repositories.UtilisateurRepository;

@Controller
@RequestMapping("/user")
//@SessionAttributes("isConnected")
public class UserController {

	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	@Autowired
	AdresseRepository adresseRepository;

	// Ajout d'un utilisateur
	@GetMapping("/signIn")
	public String ajoutUtilisateur(@ModelAttribute("formUser") UserForm userForm) {
		return "addUser";
	}

	@PostMapping("/signIn")
	public ModelAndView ajoutUtilisateur(@Validated @ModelAttribute("formUser") UserForm userForm,
			BindingResult results, HttpServletRequest request) {
		new MotdePasseValidation().validate(userForm, results);
		ModelAndView mdv = new ModelAndView();
		if (results.hasErrors()) {
			mdv.setViewName("addUser");
			mdv.addObject("formUser", userForm);
			mdv.addObject("errors", results);
		} else {
			Adresse a = new Adresse(userForm.getNumero(), userForm.getRue(), userForm.getCodePostal(),
					userForm.getVille());
			List<Adresse> listAdresse = new ArrayList<>();
			listAdresse.add(a);
			Utilisateur u = new Utilisateur(userForm.getNom(), userForm.getPrenom(), userForm.getEmail(), userForm.getTelephone(), 
					userForm.getMotPasse(), LocalDate.now(), userForm.getDateNaissance());
			u.setAdresseFacturation(listAdresse);
			u.setAdresseLivraison(listAdresse);
			utilisateurRepository.saveAndFlush(u);
			request.getSession().setAttribute("isConnected", u);			
			mdv.setViewName("redirect:/home/");
		}
		return mdv;
	}
	
	 @GetMapping("/logout")
	    public String logout(HttpServletRequest request) {
	        request.getSession().setAttribute("isConnected", null);
	        return "redirect:/home/";
	    }
	
	@GetMapping("/infos")
	public String getUserInfos() {
		return "userInfos";
	}

	@GetMapping("/update")
	public String updateUser(@ModelAttribute("formUser") UserForm userForm) {
		return "updateUser";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteBasket(@PathVariable long id, @ModelAttribute("user") List<Utilisateur> u) {
		Utilisateur ut=findBasketLine(id, panier);
        if(bl!=null) {
            panier.remove(bl);
        }
        return "redirect:/articles/basket";
    }


}
