package fr.dawan.springbootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.springbootProject.entities.Marque;

public interface MarqueRepository extends JpaRepository<Marque, Long> {
	
	Marque findByNom(String nom);

}