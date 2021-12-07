package com.blo;

import java.util.List;

import com.dto.Coordonnees;
import com.dto.Ville;

public interface VilleBLO {

	List<Ville> getVilles();
	
	List<Ville> getVillesByCP(String cp);
	
	List<Ville> getVillesByInsee(String insee);

	void ajouterVille(Ville ville);
	
	void modifierVille(Ville ville, String insee);
	
	void supprimerVille(String insee);
}
