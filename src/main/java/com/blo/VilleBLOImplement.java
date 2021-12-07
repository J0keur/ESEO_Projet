package com.blo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VilleDAO;
import com.dto.Ville;

@Service
public class VilleBLOImplement implements VilleBLO {

	@Autowired
	private VilleDAO villeDao;

	public List<Ville> getVilles() {
		List<Ville> villes = null;
		try {
			villes  = villeDao.Villes();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return villes;
	}
	
	public List<Ville> getVillesByInsee(String insee) {
		List<Ville> villes = null;
		villes  = villeDao.getVillesByInsee(insee);
		return villes;
	}
	
	public List<Ville> getVillesByCP(String cp) {
		List<Ville> villes = null;
		try {
			villes  = villeDao.getVillesByCP(cp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return villes;
	}

	public void ajouterVille(Ville ville) {
		try {
			villeDao.ajouterVille(ville);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void modifierVille(Ville ville, String insee) {
		villeDao.modifierVille(ville, insee);
	}

	public void supprimerVille(String insee) {
		villeDao.supprimerVille(insee);
	}

}
