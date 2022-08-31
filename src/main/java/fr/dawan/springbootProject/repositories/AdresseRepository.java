package fr.dawan.springbootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.springbootProject.entities.Adresse;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
	
	Adresse findById(long id);
	
	
}