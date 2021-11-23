package com.blo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dao.VilleDAO;
import com.dto.Ville;


@Service 
public class VilleBLOImplement implements VilleBLO {
	
	private VilleDAO villeDao;
	
	public	List<Ville> getInfoVille(String param) {
		if(param==null) {
			try {
				return villeDao.nomVilles();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				return villeDao.infoVilleParam(param);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
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
