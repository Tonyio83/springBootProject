package fr.dawan.springbootProject.forms;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import fr.dawan.springbootProject.entities.Adresse;

public class AdresseForm {
	
	@NotBlank
	@Size(max = 4)
	private String numero;
	
	@NotBlank
	@Size(max = 255)
	private String rue;
	
	@NotBlank
	@Size(min = 5, max = 6)
	private String codePostal;
	
	@NotBlank
	@Size(max = 255)
	private String ville;

	public AdresseForm() {
	}

	public AdresseForm(Adresse a) {
		this.numero = a.getNumero();
		this.rue = a.getRue();
		this.codePostal = a.getCodePostal();
		this.ville = a.getVille();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	

}
