package fr.dawan.springbootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.springbootProject.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

	Categorie findByNom(String nom);
}