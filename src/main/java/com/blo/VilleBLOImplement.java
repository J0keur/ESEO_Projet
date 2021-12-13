package com.blo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.config.JDBCConfiguration;
import com.dao.DaoFactory;
import com.dao.VilleDAO;
import com.dto.Ville;

@Service
public class VilleBLOImplement implements VilleBLO {

	@Autowired
	private VilleDAO villeDao;
	
	public void init() {
		DaoFactory dao = DaoFactory.getInstance();
		this.villeDao = dao.getVilleDao();
	}
	
	public List<Ville> getVilles(String insee) {
		init();
		List<Ville> villes = null;
		try {
			if(insee == null) {
				villes  = villeDao.Villes();
			}
			else {
				villes = villeDao.getVillesByInsee(insee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return villes;
	}

	public void ajouterVille(Ville ville) {
		init();
		try {
			villeDao.ajouterVille(ville);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void modifierVille(Ville ville, String insee) {
		init();
		villeDao.modifierVille(ville, insee);
	}

	public void supprimerVille(String insee) {
		init();
		villeDao.supprimerVille(insee);
	}

}
