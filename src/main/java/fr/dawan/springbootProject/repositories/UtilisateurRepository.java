package fr.dawan.springbootProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import fr.dawan.springbootProject.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	
//	List<Utilisateur> findAllUtilisateur(UtilisateurRepository utilisateurs);
	
	@org.springframework.data.jpa.repository.Query ("select a from Utilisateur a where id = :id")
	List<Utilisateur> UtilisateurById(@Param("id") Long id);
	
	
}