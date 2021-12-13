package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blo.VilleBLO;
import com.dto.Ville;


@RestController
public class VilleController {
	
	@Autowired
	private VilleBLO villeService;
	
	@RequestMapping(value ="/ville",method= RequestMethod.GET)
	@ResponseBody
	public List<Ville>  appelGetVilles(@RequestParam(required = false,value = "insee") String insee) {
		return villeService.getVilles(insee);
	}
	
	@PostMapping("/ville")
	public void ajouterVille(@RequestBody Ville ville) {
		villeService.ajouterVille(ville);
	}
	
	@RequestMapping(value ="/ville",method= RequestMethod.PUT)
	public void modifierVille(@RequestBody Ville ville, @RequestParam(required = true,value = "insee") String insee) {
		System.out.println("Appel du PUT");
		villeService.modifierVille(ville, insee);
	}
	
	@RequestMapping(value = "/ville", method= RequestMethod.DELETE)
	public void supprimerVille(@RequestParam(required = true,value = "insee") String insee) {
		villeService.supprimerVille(insee);
	}
	
}
