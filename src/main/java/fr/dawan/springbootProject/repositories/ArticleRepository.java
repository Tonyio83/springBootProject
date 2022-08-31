package fr.dawan.springbootProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import fr.dawan.springbootProject.entities.Article;
import fr.dawan.springbootProject.entities.Categorie;
import fr.dawan.springbootProject.entities.Marque;

public interface ArticleRepository extends JpaRepository<Article, Long> {
	
	@org.springframework.data.jpa.repository.Query ("select a from Article a where categorie = :id")
	List<Article> ArticleByCategorie(@Param("id") Categorie cat);
	
	@org.springframework.data.jpa.repository.Query ("select a from Article a where id = :id")
	List<Article> ArticleById(@Param("id") Long id);
	
	@org.springframework.data.jpa.repository.Query ("select a from Article a where marque = :id")
	List<Article> ArticleByMarque(@Param("id") Marque id);
	
	@org.springframework.data.jpa.repository.Query ("select a from Article a where promo != 0")
	List<Article> ArticleWithPromo();
	

}