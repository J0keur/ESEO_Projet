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
	public List<Ville>  appelGetVilles() {
		return villeService.getVilles();
	}
	
	@RequestMapping(value ="/villebycp",method= RequestMethod.GET)
	@ResponseBody
	public List<Ville>  appelGetVillesByCP(@RequestParam(required = true,value = "cp") String cp) {
		return villeService.getVillesByCP(cp);
	}
	
	@RequestMapping(value ="/villebyinsee",method= RequestMethod.GET)
	@ResponseBody
	public List<Ville>  appelGetVillesByInsee(@RequestParam(required = true,value = "insee") String insee) {
		return villeService.getVillesByInsee(insee);
	}
	
	@PostMapping("/ajoutville")
	public void ajouterVille(@RequestBody Ville ville) {
		villeService.ajouterVille(ville);
	}
	
	@PostMapping("/modifville")
	public void modifierVille(@RequestBody Ville ville, String insee) {
		villeService.modifierVille(ville, insee);
	}
	
	@RequestMapping(value = "/supprville", method= RequestMethod.DELETE)
	public void supprimerVille(@RequestParam(required = true,value = "codeInsee") String insee) {
		villeService.supprimerVille(insee);
	}
	
}
