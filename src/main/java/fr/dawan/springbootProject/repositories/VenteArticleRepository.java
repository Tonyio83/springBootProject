package fr.dawan.springbootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.springbootProject.entities.VenteArticle;

public interface VenteArticleRepository extends JpaRepository<VenteArticle, Long> {

}