package fr.dawan.springbootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.springbootProject.entities.AvisArticle;

public interface AvisArticleRepository extends JpaRepository<AvisArticle, Long> {

}