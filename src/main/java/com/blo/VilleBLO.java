package com.blo;

import java.util.List;

import com.dto.Ville;

public interface VilleBLO {

	List<Ville> getInfoVille(String param);

	void ajouterVille(Ville ville);
	
	void modifierVille(Ville ville, String insee);
	
	void supprimerVille(String insee);
}
