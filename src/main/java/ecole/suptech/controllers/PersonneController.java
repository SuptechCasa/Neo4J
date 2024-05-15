package ecole.suptech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecole.suptech.entities.Personne;
import ecole.suptech.entities.Ville;
import ecole.suptech.repositories.PersonneRepository;
import ecole.suptech.repositories.VilleRepository;

@RestController
@RequestMapping("personnes")
public class PersonneController {
@Autowired PersonneRepository personneRepository;
@Autowired VilleRepository villeRepository;
@GetMapping
public List<Personne> getAllPersonnes(){
	return personneRepository.findAll();
}
@PostMapping("/{idville}")
public Personne addPersonne(@PathVariable Long idville,@RequestBody Personne personne) {
	Ville ville=villeRepository.findById(idville).orElse(null);
	if (ville!=null) {
		personne.setVille(ville);
		return personneRepository.save(personne);
	}
	return null;
}
}
