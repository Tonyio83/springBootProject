package fr.dawan.springbootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.dawan.springbootProject.entities.Panier;

public interface PanierRepository extends JpaRepository<Panier, Long> {

//	@Query(nativeQuery = true, value = "Select sum(prix) from articles a")
//	double CalculTotal();

	/*
	 * @Query(nativeQuery = true,value =
	 * "Select sum(prix) from articles join vente_articles on vente_articles.panier where id = :id"
	 * ) double CalculTotal2(@Param("id") long idPanier);
	 */

//	@Procedure("GET_COUNT_BY_PRIX")
//	int countByPrix(double montant);
	
	
	
}